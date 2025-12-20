package com.xworkz.service.response;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/start",loadOnStartup = 1)
public class Bicycle extends GenericServlet {

    public Bicycle(){
        System.out.println("starts to ride a bicycle");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initialised to move");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("reached destination");
    }

    @Override
    public void destroy() {
        System.out.println("is being stopped");
    }
}
