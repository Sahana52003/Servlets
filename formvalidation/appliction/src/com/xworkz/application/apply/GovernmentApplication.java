package com.xworkz.application.apply;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/application",loadOnStartup = 3)
public class GovernmentApplication extends GenericServlet {
    public GovernmentApplication(){
        System.out.println("Application form");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
       String name= servletRequest.getParameter("name");
        System.out.println("Name is : " + name);
        String id= servletRequest.getParameter("id");
        System.out.println("Id Number is : " + id);
        String email= servletRequest.getParameter("email");
        System.out.println("EmailID  is : " + email);
        String mobile= servletRequest.getParameter("mobile");
        System.out.println("mobile Number is : " + mobile);
        String password= servletRequest.getParameter("password");
        System.out.println("Password is : " + password);
        String indian= servletRequest.getParameter("Indian");
        System.out.println("Resident is : " + indian);
        String nonResident= servletRequest.getParameter("non-Resident");
        System.out.println("Resident is : " + nonResident);
        String documents= servletRequest.getParameter("documents");
        System.out.println("Documents are is : " + documents);
        String choose= servletRequest.getParameter("choose");
        System.out.println("files are : " + choose);
        String address= servletRequest.getParameter("address");
        System.out.println("address is : " + address);
        String dob= servletRequest.getParameter("dob");
        System.out.println("date of birth is : " + dob);
        String month= servletRequest.getParameter("month");
        System.out.println("month is : " + month);
        String week= servletRequest.getParameter("week");
        System.out.println("week is : " + week);
        String time= servletRequest.getParameter("time");
        System.out.println("time is : " + time);
        String docs= servletRequest.getParameter("docs");
        System.out.println("docs is : " + docs);
        String color= servletRequest.getParameter("color");
        System.out.println("color is : " + color);
        String age= servletRequest.getParameter("age");
        System.out.println("age is : " + age);
        String link= servletRequest.getParameter("link");
        System.out.println("link is : " + link);
        String search= servletRequest.getParameter("search");
        System.out.println("search : " + search);
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi</h1>"+name);
        printWriter.println("<p style='color:green'>Application is Registered</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

}
