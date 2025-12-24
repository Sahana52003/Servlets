package com.xworkz.servletapp.runner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/detail")
public class Student extends GenericServlet {

    public Student(){
        System.out.println("gets to take details ");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initialized in system");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("stored all student details");
    }

    @Override
    public void destroy() {
        System.out.println("is being stopped");
    }
}
