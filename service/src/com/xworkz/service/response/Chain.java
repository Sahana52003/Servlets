package com.xworkz.service.response;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/update",loadOnStartup = 7)
public class Chain extends GenericServlet {

    public Chain(){
        System.out.println("their desgin is complete to showcase in a shop");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("All the items are sold out");
    }
}
