package com.action;

import com.entity.Product;
import com.entity.Scanbarcode;
import com.service.ProductService;
import com.service.ScanService;
import com.service.Tradingservice;
import java.io.PrintStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TradeAction {
	private ScanService scanService;
	private Tradingservice tradingService;
	private ProductService productservice;

	@Resource(name = "scanService")
	public void setScanService(ScanService scanservice) {
		this.scanService = scanservice;
	}

	@Resource(name = "tradingService")
	public void setTradingService(Tradingservice tradingService) {
		this.tradingService = tradingService;
	}

	@Resource(name = "productService")
	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	@RequestMapping({ "/trading/Scan.action" })
	public String getscanMethod(HttpServletRequest request) throws Exception {
		System.out.println(" 卖出货物的条形码 " + request.getParameter("Scan"));

		String tradingScan = request.getParameter("Scan");

		Scanbarcode scanbarcode = this.scanService.selectcancode(tradingScan);
		String productcode = scanbarcode.getProductCode();
		System.out.println("条形码对应的商品码" + productcode);

		this.productservice.updatenumberjian1product(productcode);

		Product product = this.productservice.findbyproductcode(productcode);
		System.out.println(product.getProductName());
		int salemoney = product.getPdSalePrice();
		System.out.println("销售价格" + salemoney);

		this.scanService.deleteScancode(tradingScan);

		Object m = request.getSession().getAttribute("salemoney");
		int m1 = 0;
		if (m == null) {
			System.out.println("第一次");
			request.getSession().setAttribute("salemoney",
					Integer.valueOf(salemoney));
			return "redirect:/trading/scancode.jsp";
		}

		m1 = Integer.parseInt(String.valueOf(m));
		request.getSession().setAttribute("salemoney",
				Integer.valueOf(m1 + salemoney));
		System.out.println(m1 + salemoney);
		return "redirect:/trading/scancode.jsp";
	}

	@RequestMapping({ "/trading/settleaccounts" })
	public String settleaccountMethod(HttpServletRequest request, Model model)
			throws Exception {
		int allmoney = ((Integer) request.getSession()
				.getAttribute("salemoney")).intValue();
		System.out.println("算账了   " + allmoney);
		this.tradingService.addTrad(allmoney);
		request.getSession().removeAttribute("salemoney");
		model.addAttribute("money", Integer.valueOf(allmoney));
		return "/trading/count.jsp";
	}
}
