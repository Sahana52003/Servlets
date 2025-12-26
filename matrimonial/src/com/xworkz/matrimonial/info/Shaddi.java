package com.xworkz.matrimonial.info;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/registrat",loadOnStartup = 1)
public class Shaddi extends GenericServlet {
    public Shaddi(){
        System.out.println("Login Form is Created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String emailid = servletRequest.getParameter("email");
        System.out.println("Registered email-id is : " + emailid);
        String pwd = servletRequest.getParameter("password");
        System.out.println("password login : " + pwd);
        String profile = servletRequest.getParameter("profileFor");
        System.out.println("where the porfile is  : " + profile);
        String firstname = servletRequest.getParameter("fname");
        System.out.println("First name : " + firstname);
        String lastname = servletRequest.getParameter("lname");
        System.out.println("Last Name : " + lastname);
        String gend = servletRequest.getParameter("gender");
        System.out.println("gender : " + gend);
        String birth = servletRequest.getParameter("dob");
        System.out.println("date of birth is : " + birth);
        String relig = servletRequest.getParameter("religion");
        System.out.println("Religion is : " + relig);
        String lang = servletRequest.getParameter("language");
        System.out.println("Language : " + lang);
        String nation = servletRequest.getParameter("country");
        System.out.println("Country is : " + nation);
        String phone = servletRequest.getParameter("mobile");
        System.out.println("Phone number : " + phone);
        System.out.println("service method is called");
    }
}
