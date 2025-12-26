package com.xworkz.events.register;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/button",loadOnStartup = 1)
public class EventRegistration extends GenericServlet {
    public EventRegistration(){

        System.out.println("Ready to register");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("username");
        System.out.println("User name is : " + name);
        String id=servletRequest.getParameter("email");
        System.out.println("Email-id is : " + id);
        String mobile=servletRequest.getParameter("number");
        System.out.println("Phone Number : " + mobile);
        String locat=servletRequest.getParameter("location");
        System.out.println("Event location : " + locat);
        String diet=servletRequest.getParameter("eat");
        System.out.println("Food : " + diet);
        String days=servletRequest.getParameter("day");
        System.out.println("Number of days : " + days);
        String add=servletRequest.getParameter("address");
        System.out.println("Address is : " + add);
        System.out.println("Submit responded");
    }
}
