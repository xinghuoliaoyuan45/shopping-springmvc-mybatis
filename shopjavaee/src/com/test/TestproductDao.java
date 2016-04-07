package com.test;

import com.dao.ProductDao;
import com.entity.Product;
import java.io.PrintStream;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestproductDao {
	@Test
	public void test8() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productdao = (ProductDao) ac.getBean("productDaoID");
		productdao.add(new Product("0010", "芒果", "0xfdff1", "水果", 4, 15, 10));
	}

	@Test
	public void test15() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productDao = (ProductDao) ac.getBean("productDaoID");
		List<Product> p = productDao.findByid("0001");
		for (Product s : p)
			System.out
					.println(s.getProductId() + ":" + s.getProductName() + ":"
							+ s.getPdPurchasePrice() + ":"
							+ s.getProductNumber());
	}

	@Test
	public void test16() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productDao = (ProductDao) ac.getBean("productDaoID");
		List<Product> p = productDao.findByname("香蕉");
		for (Product s : p)
			System.out.println(s.getProductId() + ":" + s.getProductName()
					+ ":" + s.getPdSalePrice() + ": " + s.getPdPurchasePrice());
	}

	@Test
	public void test4() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productdao = (ProductDao) ac.getBean("productDaoID");

		List<Product> P = productdao.findAll();
		for (Product s : P)
			System.out.println("商品名称    " + s.getProductName() + "商品卖价   "
					+ s.getPdSalePrice() + "商品进价    " + s.getPdPurchasePrice());
	}

	@Test
	public void test5() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productdao = (ProductDao) ac.getBean("productDaoID");
		productdao.delete("0010");
	}

	@Test
	public void test6() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring_mybatis.xml" });
		ProductDao productdao = (ProductDao) ac.getBean("productDaoID");
		Product product1 = new Product("0001", 15000, 5);
		productdao.updateproduct(product1);
	}
}
