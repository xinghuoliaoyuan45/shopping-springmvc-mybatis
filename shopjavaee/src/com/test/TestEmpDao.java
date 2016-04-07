package com.test;

import com.dao.EmpDao;
import com.entity.Emp;
import java.io.PrintStream;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDao
{
  @Test
  public void test2()
    throws Exception
  {
    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     EmpDao empDao = (EmpDao)ac.getBean("empDaoID");
     empDao.add(new Emp("0902e11111", "1", "1"));
  }

  @Test
  public void test3()
    throws Exception
  {
     ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     EmpDao empdao = (EmpDao)ac.getBean("empDaoID");
    empdao.add(new Emp("10121", "马骁尧", "m", "19", "199609161051", "18749818136", "9000"));
  }

  @Test
  public void test10()
    throws Exception
  {
     ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
    EmpDao empDao = (EmpDao)ac.getBean("empDaoID");
     List<Emp> emp = empDao.findempbyname("王飞飞");
     for (Emp ep : emp)
    {
      System.out.println(ep.getEmpId() + "  " + ep.getEmpName());
    }
  }

  @Test
  public void test11()
    throws Exception
  {
   ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     EmpDao empDao = (EmpDao)ac.getBean("empDaoID");
     empDao.deleteemp("08");
  }

  @Test
  public void test19()
    throws Exception
  {
    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring_mybatis.xml" });
     EmpDao empDao = (EmpDao)ac.getBean("empDaoID");
     List<Emp> emp = empDao.findemp();
    for (Emp ep : emp)
    {
      System.out.println(ep.getEmpId() + "  " + ep.getEmpName());
    }
  }
}

