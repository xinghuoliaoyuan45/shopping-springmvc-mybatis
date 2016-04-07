 package com.action;

 import com.entity.Emp;
 import com.service.EmpService;
 import java.io.PrintStream;
 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
 public class EmpAction
 {
   private EmpService empService;
   @Resource(name="empServiceID")
   public void setEmpService(EmpService empService)
  {
     this.empService = empService;
   }
 
   @RequestMapping({"/emp/register"})
   public String registerMethod(Emp emp)
     throws Exception
   {
     this.empService.register(emp);
     return "/hr/success.jsp";
   }
   @RequestMapping({"/emp/delete"})
  public String DeleteMethod(String id)
     throws Exception
   {
    this.empService.deletebyid(id);
     return "/hr/success.jsp";
   }
 
   @RequestMapping({"/emp/findbyname"})
   public String findbynameMethod(String name, Model model)
    throws Exception
   {
     System.out.println(name);
    List emps = this.empService.findbyname(name);
     model.addAttribute("findbyname", emps);
    return "/hr/findemp.jsp";
  }

   @RequestMapping({"/emp/findall"})
   public String findallMethod(Model model)
    throws Exception
   {
    List emps = this.empService.findallemp();
    model.addAttribute("findall", emps);
    return "/hr/findallemp.jsp";
   }
}
