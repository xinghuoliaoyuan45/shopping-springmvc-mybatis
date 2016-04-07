 package com.test;
 
 import com.dao.ScanDao;
 import com.entity.Scanbarcode;
 import java.io.PrintStream;
 import org.junit.Test;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 public class TestScan
 {
   @Test
   public void test1()
     throws Exception
   {
     ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     ScanDao scanDao = (ScanDao)ac.getBean("ScanDaoID");
     Scanbarcode scan = new Scanbarcode("g", "g00006");
     scanDao.addScanbarcode(scan);
   }
 
   @Test
   public void test2()
     throws Exception
   {
    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
    ScanDao scanDao = (ScanDao)ac.getBean("ScanDaoID");
     scanDao.deleteScanbarcode("g00006");
   }
 
   @Test
   public void test3()
     throws Exception
   {
    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     ScanDao scanDao = (ScanDao)ac.getBean("ScanDaoID");
    Scanbarcode scancode = scanDao.findScancode("a10001");
    System.out.println(scancode.getProductCode());
   }
 }

