package com.xworkz.service.response;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns ="/cool",loadOnStartup = 9)
public class Refrigerator extends GenericServlet {

    public Refrigerator(){
        System.out.println("stores the items in refrigerator");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("it cools all the items");
    }
}
