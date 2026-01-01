//package com.xworkz.servlets.api;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/start",loadOnStartup = 1)
//public class Pizza extends GenericServlet {
//
//   public Pizza(){
//       System.out.println("Order is delivered");
//   }
//
//    @Override
//    public void init() throws ServletException {
//        System.out.println("sending a message");
//    }
//
//    @Override
//    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        System.out.println("is being called");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destry the object");
//    }
//}
