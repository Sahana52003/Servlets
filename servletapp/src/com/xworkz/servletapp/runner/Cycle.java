package com.xworkz.servletapp.runner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/ride",loadOnStartup = 1)
public class Cycle extends GenericServlet {

    public Cycle(){
        System.out.println("starts to ride a bicycle");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initialised to move");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("destination");
    }

    @Override
    public void destroy() {
        System.out.println("stopped");
    }
}
