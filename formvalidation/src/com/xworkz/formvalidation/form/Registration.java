package com.xworkz.formvalidation.form;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/regist",loadOnStartup = 1)
public class Registration extends GenericServlet {
    public Registration(){
        System.out.println("Login form");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String user=servletRequest.getParameter("name");
        System.out.println("User Name : " + user);
        String mail_id=servletRequest.getParameter("email");
        System.out.println("Email id is : " + mail_id);
        String pwd=servletRequest.getParameter("password");
        System.out.println("Password is : " + pwd);
        String phone=servletRequest.getParameter("mobile");
        System.out.println("Mobile Number is : " + phone);
        String tme=servletRequest.getParameter("time");
        System.out.println("Today's time is : " + tme);
        String dte=servletRequest.getParameter("date");
        System.out.println("date is : " + dte);
        String colour=servletRequest.getParameter("color");
        System.out.println("Color is : " + colour);
       String gender= servletRequest.getParameter("gender");
        System.out.println("gender is : " + gender);
        String dateOfBirth=servletRequest.getParameter("dob");
        System.out.println("Date of birth is : " + dateOfBirth);
        String hobby=servletRequest.getParameter("hobby");
        System.out.println("Hobbies are : " + hobby);
        servletResponse.setContentType("text/html");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1>Hi</h1>"+user);
        printWriter.println("<p style='color:green'>Registration is Confirmed</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
