package com.test;

import com.dao.TradingDao;
import com.entity.Trading;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTrading {
	@Test
	public void test1add() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		TradingDao tradingDao = (TradingDao) ac.getBean("TradingDaoID");
		String dealDate = new SimpleDateFormat("yyyyMMddHHmmss")
				.format(Calendar.getInstance().getTime());

		Trading trad = new Trading(dealDate, 10);
		tradingDao.addtrading(trad);
	}

	@Test
	public void test2findall() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		TradingDao tradingDao = (TradingDao) ac.getBean("TradingDaoID");
		List<Trading> trads = tradingDao.findalltrade();
		for (Trading trading : trads)
			System.out.println(trading.toString());
	}

	@Test
	public void test3findbybig() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		TradingDao tradingDao = (TradingDao) ac.getBean("TradingDaoID");
		List<Trading> trads = tradingDao.findbymoneybig(50);
		for (Trading trading : trads)
			System.out.println(trading.toString());
	}
}
