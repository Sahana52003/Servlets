package com.xworkz.management.signup;

import com.xworkz.management.signup.dto.ManagementDTO;
import com.xworkz.management.signup.service.ManagementService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/employee",loadOnStartup = 6)
public class Employee extends GenericServlet {
    public Employee(){
        System.out.println("Login Employee details");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String employeeId = servletRequest.getParameter("employeeId");
        System.out.println("Employee ID: " + employeeId);
        String name = servletRequest.getParameter("name");
        System.out.println("Name: " + name);
        String salary = servletRequest.getParameter("salary");
        System.out.println("Salary: " + salary);
        String date = servletRequest.getParameter("date");
        System.out.println("Date: " + date);
        String week = servletRequest.getParameter("week");
        System.out.println("Week: " + week);
        String shiftTime = servletRequest.getParameter("shiftTime");
        System.out.println("Shift Time: " + shiftTime);
        String department = servletRequest.getParameter("department");
        System.out.println("Department: " + department);
        String role = servletRequest.getParameter("role");
        System.out.println("Role: " + role);
        String notes = servletRequest.getParameter("notes");
        System.out.println("Notes: " + notes);
        String badgeColor = servletRequest.getParameter("badgeColor");
        System.out.println("Badge Color: " + badgeColor);
        PrintWriter printWriter=servletResponse.getWriter();
        Double salaries=Double.valueOf(salary);
        ManagementDTO managementDTO=new ManagementDTO(employeeId,name,salary,department,role);
        ManagementService managementService = new ManagementService();
        boolean isValidate = managementService.checkData(managementDTO);
        if (isValidate) {
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi</h1>"+name);
        printWriter.println("<p style='color:green'>Details are Registered Successfully</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }else{
        printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Employee Details</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>");
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
}
}