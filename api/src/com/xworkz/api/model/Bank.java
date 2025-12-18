package com.xworkz.api.model;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/at",loadOnStartup =1)
public class Bank extends GenericServlet {

    public Bank(){
        System.out.println("Check the balance through the pinnumber");
    }

    public Bank(int amount){
        System.out.println("Shows current balance"+amount);
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
