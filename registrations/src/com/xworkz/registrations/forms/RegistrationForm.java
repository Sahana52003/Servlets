package com.xworkz.registrations.forms;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/regform",loadOnStartup = 4)
public class RegistrationForm extends GenericServlet {
    public RegistrationForm(){
        System.out.println("Entered login form to register");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        System.out.println("Name is:"+name);
        String id=servletRequest.getParameter("email");
        System.out.println("Email id :"+id);
        String pwd=servletRequest.getParameter("password");
        System.out.println("password :"+pwd);
        String ageValue=servletRequest.getParameter("age");
        System.out.println("age :"+ageValue);
        String birth=servletRequest.getParameter("dob");
        System.out.println("birth :"+birth);
        String gendr=servletRequest.getParameter("gender");
        System.out.println("gender:"+gendr);
        String hobb=servletRequest.getParameter("eat");
        System.out.println("hobbies:"+hobb);
        String hobbies=servletRequest.getParameter("sleep");
        System.out.println("hobbies:"+hobbies);
        String hobby=servletRequest.getParameter("wake");
        System.out.println("hobbies:"+hobby);
        String movie=servletRequest.getParameter("watch Movies");
        System.out.println("hobbies:"+movie);
        String mobile=servletRequest.getParameter("phone");
        System.out.println("phone number :"+mobile);
        String tim=servletRequest.getParameter("time");
        System.out.println("time:"+tim);
        String files=servletRequest.getParameter("file");
        System.out.println("choosen file:"+files);
        System.out.println("Successfully login");
    }
}
