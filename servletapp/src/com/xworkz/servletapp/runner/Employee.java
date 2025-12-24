package com.xworkz.servletapp.runner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/stop",loadOnStartup = 2)
public class Employee extends GenericServlet {

    public Employee(){
        System.out.println("gets to work");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("has been initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("calls the service method");
    }

    @Override
    public void destroy() {
        System.out.println("then destroy all");
    }
}
