package com.xworkz.servletapp.runner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/update")
public class Order extends GenericServlet {

    public Order(){
        System.out.println("items are delivered");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("packed all itms to deliver");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("reached destination");
    }

    @Override
    public void destroy() {
        System.out.println("canceled it ");
    }
}
