 package com.action;

 import com.entity.LoginUser;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.image.BufferedImage;
 import java.util.Random;
 import java.util.ResourceBundle;
 import javax.imageio.ImageIO;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 @Controller
 public class LoginAction
 {
  @RequestMapping({"/login/entry"})
  public String registerMethod(LoginUser luser, HttpServletRequest request)
    throws Exception
   {
     String lusername = luser.getName();
     String lusepassword = luser.getPassword();
    String lusecode = luser.getCode();

    ResourceBundle rb = ResourceBundle.getBundle("user");
    String mastername = rb.getString("master");
    String matserpassword = rb.getString("masterpassword");
    String saleman = rb.getString("salesperson");
   String salepassword = rb.getString("salepassword");

    String m = (String)request.getSession().getAttribute("code");
 
     if (!lusecode.equals(m))
     {
      return "redirect:/login/login.jsp";
    }
   if ((lusername.equals(mastername)) && (lusepassword.equals(matserpassword)))
     {
      return "redirect:/login/master/alloperation.html";
     }
 
    if ((lusername.equals(saleman)) && (lusepassword.equals(salepassword)))
     {
       return "redirect:/login/salesperson/alloperation.html";
   }

     return "redirect:/login/warn.jsp";
   }

   @RequestMapping({"/login/Coding"})
  public void CodingMethod(HttpServletRequest request, HttpServletResponse response) throws Exception
  {
     BufferedImage bImage = new BufferedImage(68, 22, 1);

    Graphics graphics = bImage.getGraphics();
     Color color = new Color(220, 150, 130);
    graphics.setColor(color);

     graphics.fillRect(0, 0, 78, 27);

   char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
 
    Random random = new Random();
    int len = ch.length;
     StringBuffer sb = new StringBuffer();
     for (int i = 0; i < 4; i++) {
       int index = random.nextInt(len);
       graphics.setColor(new Color(random.nextInt(88), random.nextInt(188), random.nextInt(255)));
       graphics.drawString(""+ch[index], i * 15 + 3, 18);
      sb.append(ch[index]);
     }

     request.getSession().setAttribute("code", sb.toString());
     ImageIO.write(bImage, "JPG", response.getOutputStream());
  }
 }
