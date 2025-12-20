package com.xworkz.service.response;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/stop",loadOnStartup = 3)
public class Building extends GenericServlet {

    public Building(){
        System.out.println("under the constructiion to complete");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Then design is ready to make");
    }

}
