 package com.service;
 
 import com.dao.EmpDao;
 import com.entity.Emp;
 import java.util.List;
 
 public class EmpService
 {
   private EmpDao empDao;
 
   public void setEmpDao(EmpDao empDao)
   {
     this.empDao = empDao;
   }
 
   public void register(Emp emp)
     throws Exception
   {
     this.empDao.add(emp);
   }
 
   public void deletebyid(String id)
   {
     this.empDao.deleteemp(id);
   }
 
   public List<Emp> findbyname(String name)
     throws Exception
   {
    List emps = this.empDao.findempbyname(name);
 
    return emps;
   }
 
   public List<Emp> findallemp()
     throws Exception
   {
     List emps = this.empDao.findemp();
    return emps;
   }
 }

