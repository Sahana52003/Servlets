package com.xworkz.servletapp.runner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/run",loadOnStartup = 3)
public class Bank extends GenericServlet {

    public Bank(){
        System.out.println("created the account");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("stores the amount detasils");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("gives information of person");
    }

    @Override
    public void destroy() {
        System.out.println("destroy all data");
    }
}
