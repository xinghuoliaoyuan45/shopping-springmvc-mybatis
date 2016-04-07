package com.action;

import com.service.Tradingservice;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TradingbussionAction {
	private Tradingservice tradingService;

	@Resource(name = "tradingService")
	public void setTradingService(Tradingservice tradingService) {
		this.tradingService = tradingService;
	}

	@RequestMapping({ "/trading/findall" })
	public String findtradingall(Model model) {
		List trads = this.tradingService.findallTrad();
		model.addAttribute("alltrading", trads);

		return "/trading/alltradingtable.jsp";
	}

	@RequestMapping({ "/trading/findbigmoney" })
	public String findtradingbigmoney(int money, Model model) {
		List trads = this.tradingService.findbigbymoneyTrad(money);
		model.addAttribute("alltrading", trads);
		return "/trading/alltradingtable.jsp";
	}
}
