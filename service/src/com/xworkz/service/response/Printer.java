package com.xworkz.service.response;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns ="/print",loadOnStartup = 5)
public class Printer extends GenericServlet {

    public Printer(){
        System.out.println("priniting a documents ");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("scan the documents and print it");
    }
}
