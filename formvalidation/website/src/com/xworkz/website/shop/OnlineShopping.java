package com.xworkz.website.shop;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/checkout",loadOnStartup = 10)
public class OnlineShopping extends GenericServlet {
    public OnlineShopping(){
        System.out.println("Shopping Information is Created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String product=servletRequest.getParameter("product");
        System.out.println("Product name is : " + product);
        String quantity=servletRequest.getParameter("quantity");
        System.out.println("Quantity is : " + quantity);
        String name=servletRequest.getParameter("name");
        System.out.println("Name is : " + name);
        String password=servletRequest.getParameter("password");
        System.out.println("Password is : " + password);
        String expiry=servletRequest.getParameter("expiry");
        System.out.println("Expiry date is : " + expiry);
        String credit=servletRequest.getParameter("credit");
        System.out.println("Cash on : " + credit);
        String cash=servletRequest.getParameter("cash");
        System.out.println("Cash on : " + cash);
        String debit=servletRequest.getParameter("debit");
        System.out.println("Cash on : " + debit);
        String email=servletRequest.getParameter("email");
        System.out.println("Email-id : " + email);
        String mobile=servletRequest.getParameter("mobile");
        System.out.println("Phone Number : " + mobile);
        String shipping=servletRequest.getParameter("shipping");
        System.out.println("shipping is : " + shipping);
        String gifts=servletRequest.getParameter("gifts");
        System.out.println("Products are  : " + gifts);
        String dress=servletRequest.getParameter("dress");
        System.out.println(" Products are : " + dress);
        String level=servletRequest.getParameter("level");
        System.out.println("Terms are : " + level);
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