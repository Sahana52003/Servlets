package com.xworkz.information.user;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/profileInfo",loadOnStartup = 4)
public class ProfileInformation extends GenericServlet {
    public ProfileInformation(){
        System.out.println("Profile Information");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String firstName = servletRequest.getParameter("firstName");
        System.out.println("First Name: " + firstName);
        String lastName = servletRequest.getParameter("lastName");
        System.out.println("Last Name: " + lastName);
        String name = servletRequest.getParameter("name");
        System.out.println("Preferred Name: " + name);
        String email = servletRequest.getParameter("email");
        System.out.println("Email: " + email);
        String password = servletRequest.getParameter("password");
        System.out.println("Password: " + password);
        String age = servletRequest.getParameter("age");
        System.out.println("Age: " + age);
        String mobile = servletRequest.getParameter("mobile");
        System.out.println("Mobile: " + mobile);
        String website = servletRequest.getParameter("website");
        System.out.println("Website: " + website);
        String dob = servletRequest.getParameter("dob");
        System.out.println("Date of Birth: " + dob);
        String time = servletRequest.getParameter("time");
        System.out.println("Time: " + time);
        String month = servletRequest.getParameter("month");
        System.out.println("Month: " + month);
        String week = servletRequest.getParameter("week");
        System.out.println("Week: " + week);
        String gender = servletRequest.getParameter("gender");
        System.out.println("Gender: " + gender);
        String country = servletRequest.getParameter("country");
        System.out.println("Country: " + country);
        String address = servletRequest.getParameter("address");
        System.out.println("Address: " + address);
        String pic = servletRequest.getParameter("pic");
        System.out.println("Profile Picture: " + pic);
        String favColor = servletRequest.getParameter("favColor");
        System.out.println("Favorite Color: " + favColor);
        String experienceLevel = servletRequest.getParameter("experienceLevel");
        System.out.println("Experience Level: " + experienceLevel);
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi</h1>"+name);
        printWriter.println("<p style='color:green'>Profile Is Created</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
