package com.xworkz.service.response;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns ="/info",loadOnStartup = 2)
public class State extends GenericServlet {

    public State(){
        System.out.println("have a n number of states in india");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("29 states in india");
    }
}
