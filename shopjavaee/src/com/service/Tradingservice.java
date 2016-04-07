package com.service;

import com.dao.TradingDao;
import com.entity.Trading;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Tradingservice {
	TradingDao tradingdao;

	public void setTradingdao(TradingDao tradingdao) {
		this.tradingdao = tradingdao;
	}

	public void addTrad(int money) {
		String dealDate = new SimpleDateFormat("yyyyMMddHHmmss")
				.format(Calendar.getInstance().getTime());
		Trading trade = new Trading(dealDate, money);
		this.tradingdao.addtrading(trade);
	}

	public List<Trading> findallTrad() {
		return this.tradingdao.findalltrade();
	}

	public List<Trading> findbigbymoneyTrad(int money) {
		List tradings = this.tradingdao.findbymoneybig(money);
		return tradings;
	}
}
