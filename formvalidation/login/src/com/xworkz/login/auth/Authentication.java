package com.xworkz.login.auth;

import com.xworkz.login.auth.dto.LoginDTO;
import com.xworkz.login.auth.service.LoginService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/loginuser",loadOnStartup = 5)
public class Authentication extends GenericServlet {
    public Authentication() {
        System.out.println("Creating login form fro auth");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String name = servletRequest.getParameter("name");
        System.out.println("Username: " + name);
        String email = servletRequest.getParameter("email");
        System.out.println("Email: " + email);
        String password = servletRequest.getParameter("password");
        System.out.println("Password: " + password);
        String age = servletRequest.getParameter("age");
        System.out.println("Age: " + age);
        String phone = servletRequest.getParameter("phone");
        System.out.println("Phone Number: " + phone);
        String website = servletRequest.getParameter("website");
        System.out.println("Website URL: " + website);
        String search = servletRequest.getParameter("search");
        System.out.println("Search Type : " + search);
        String dob = servletRequest.getParameter("dob");
        System.out.println("Date of Birth: " + dob);
        String meetingTime = servletRequest.getParameter("meetingTime");
        System.out.println("Meeting Time: " + meetingTime);
        String profilePic = servletRequest.getParameter("profilePic");
        System.out.println("Profile Pic File Name: " + profilePic);
        String color = servletRequest.getParameter("color");
        System.out.println("Favorite Color: " + color);
        PrintWriter printWriter = servletResponse.getWriter();
        LoginDTO loginDTO=new LoginDTO(name,email,password);
        LoginService loginService = new LoginService();
        boolean isValidate = loginService.checkData(loginDTO);
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>" + name);
            printWriter.println("<p style='color:green'>Success</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Login Detailsk</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>");
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
}