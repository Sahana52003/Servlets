package com.xworkz.service.response;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns ="/fly")//,loadOnStartup = 10)
public class Drone extends GenericServlet {

    public Drone(){
        //System.out.println("Where it finds some suspicious thing through a surveillance");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("It can fly and land safely");
    }
}
