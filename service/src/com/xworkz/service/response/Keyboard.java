package com.xworkz.service.response;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns ="/type")//,loadOnStartup = 6)
public class Keyboard extends GenericServlet {

    public Keyboard(){
        //System.out.println("typing a letters ");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Have some shortcut to use ");
    }
}
