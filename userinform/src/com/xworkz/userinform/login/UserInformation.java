package com.xworkz.userinform.login;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/userlogin",loadOnStartup = 7)
public class UserInformation extends GenericServlet {
    public UserInformation(){
        System.out.println("User Information Registration");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("username");
        System.out.println("user name "+ name);
        String id=servletRequest.getParameter("email-id");
        System.out.println("email id is "+ id);
        String password=servletRequest.getParameter("passwords");
        System.out.println("password "+password);
        String mobile=servletRequest.getParameter("phone");
        System.out.println("phone Number "+mobile);
        String ageValue=servletRequest.getParameter("age");
        System.out.println("age is "+ageValue);
        String birth=servletRequest.getParameter("dob");
        System.out.println("Birth date "+ birth);
        String files=servletRequest.getParameter("file");
        System.out.println("Files "+ files);
        String colour=servletRequest.getParameter("color");
        System.out.println("colors "+colour);
        String exactTime=servletRequest.getParameter("time");
        System.out.println("Timings "+exactTime);
        String value=servletRequest.getParameter("range");
        System.out.println("Range is "+ value);
        System.out.println("registered success");
    }
}
