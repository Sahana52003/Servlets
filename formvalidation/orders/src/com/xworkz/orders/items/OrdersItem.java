package com.xworkz.orders.items;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/order",loadOnStartup = 2)
public class OrdersItem extends GenericServlet {
    public OrdersItem(){
        System.out.println("order items feedback");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    String name=servletRequest.getParameter("name");
        System.out.println("Name is : " + name);
        String email=servletRequest.getParameter("email");
        System.out.println("Email-id is : " + email);
        String phone=servletRequest.getParameter("phone");
        System.out.println("Mobile Number is : " + phone);
        String ratings=servletRequest.getParameter("ratings");
        System.out.println("Ratings are : " + ratings);
        String category=servletRequest.getParameter("category");
        System.out.println("Categories : " + category);
        String message=servletRequest.getParameter("message");
        System.out.println("Messages  is : " + message);
        String date=servletRequest.getParameter("date");
        System.out.println("Delivered date is : " + date);
        String level=servletRequest.getParameter("level");
        System.out.println("Range is  : " + level);
        String comments=servletRequest.getParameter("comments");
        System.out.println("Comments are : " + comments);
        String email1=servletRequest.getParameter("email");
        System.out.println("Email-id is : " + email);
        servletResponse.setContentType("text/html");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi</h1>"+name);
        printWriter.println("<p style='color:green'>Order Confirmed</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
