package com.xworkz.medical.registration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 7)
public class HospitalRegistration extends GenericServlet {
    public HospitalRegistration(){
        System.out.println("Patients Information");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String name = servletRequest.getParameter("name");
        System.out.println("Patient Name: " + name);
        String age = servletRequest.getParameter("age");
        System.out.println("Age: " + age);
        String gender = servletRequest.getParameter("gender");
        System.out.println("Gender: " + gender);
        String date = servletRequest.getParameter("date");
        System.out.println("Date: " + date);
        String bloodGroup = servletRequest.getParameter("bloodGroup");
        System.out.println("Blood Group: " + bloodGroup);
        String symptoms = servletRequest.getParameter("symptoms");
        System.out.println("Symptoms: " + symptoms);
        String insurance = servletRequest.getParameter("insurance");
        System.out.println("Insurance: " + insurance);
        String website = servletRequest.getParameter("website");
        System.out.println("Search details : " + website);
        String email = servletRequest.getParameter("email");
        System.out.println("Email: " + email);
        String phone = servletRequest.getParameter("phone");
        System.out.println("Mobile: " + phone);
        String color = servletRequest.getParameter("color");
        System.out.println("Color: " + color);
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi</h1>"+name);
        printWriter.println("<p style='color:green'>Patient Detail is Registered</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
