package com.xworkz.forms.formspage;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/login",loadOnStartup = 1)
public class Facebook extends GenericServlet {

    public Facebook(){
        System.out.println("Creating account to login");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name=servletRequest.getParameter("email");
        System.out.println(name);
        String pwd=servletRequest.getParameter("password");
        System.out.println(pwd);
        System.out.println("Login successfully");
//        String remeber=servletRequest.getParameter("forget");
//        System.out.println(remeber);
//        String newacc=servletRequest.getParameter("create");
//        System.out.println(newacc);
    }
}
