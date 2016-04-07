package com.action;

import com.entity.Product;
import com.service.ProductService;
import java.io.PrintStream;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductAction {
	private ProductService productservice;

	@Resource(name = "productService")
	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}

	@RequestMapping({ "/product/addproduct" })
	public String addproduct(Product product) throws Exception {
		this.productservice.addproduct(product);
		return "/product/success.jsp";
	}

	@RequestMapping({ "/product/deleteproduct" })
	public String deleteproduct(String id) throws Exception {
		this.productservice.deletebyid(id);
		return "/product/success.jsp";
	}

	@RequestMapping({ "/product/updatesale" })
	public String updatesaleproduct(Product product) throws Exception {
		System.out.println("id" + product.getProductId() + "进价  :"
				+ product.getPdPurchasePrice() + "卖出价 :"
				+ product.getPdSalePrice());
		this.productservice.updatesaleproduct(product);
		return "/product/success.jsp";
	}

	@RequestMapping({ "/product/updatenumber" })
	public String updatenumberproduct(Product product) throws Exception {
		System.out.println("id   " + product.getProductId() + "number    "
				+ product.getProductNumber());
		this.productservice.updatenumberproduct(product);
		return "/product/success.jsp";
	}

	@RequestMapping({ "/product/listallproduct" })
	public String showallproduct(Model model) throws Exception {
		List products = this.productservice.findallproduct();
		model.addAttribute("productall", products);
		return "/product/showallproduct.jsp";
	}

	@RequestMapping({ "/product/productbyid" })
	public String showbyidproduct(String id, Model model) throws Exception {
		List products = this.productservice.findbyid(id);
		model.addAttribute("productbyid", products);
		return "/product/showbyid.jsp";
	}

	@RequestMapping({ "/product/productbyname" })
	public String showbynameproduct(String name, Model model) throws Exception {
		List products = this.productservice.findbyname(name);
		model.addAttribute("productbyname", products);
		return "/product/showbyname.jsp";
	}
}
