package com.xworkz.support.desk;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ticket",loadOnStartup = 9)
public class HelpDesk extends GenericServlet {
    public HelpDesk(){
        System.out.println("Issues Details");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String subject = servletRequest.getParameter("subject");
        System.out.println("Subject: " + subject);
        String description = servletRequest.getParameter("description");
        System.out.println("Description: " + description);
        String email = servletRequest.getParameter("email");
        System.out.println("Email: " + email);
        String phone = servletRequest.getParameter("phone");
        System.out.println("Mobile: " + phone);
        String docs = servletRequest.getParameter("docs");
        System.out.println("Attachment Needed: " + docs);
        String department = servletRequest.getParameter("department");
        System.out.println("Department: " + department);
        String comments = servletRequest.getParameter("comments");
        System.out.println("Comments: " + comments);
        String ticketDate = servletRequest.getParameter("ticketDate");
        System.out.println("Ticket Date: " + ticketDate);
        String ticketMonth = servletRequest.getParameter("ticketMonth");
        System.out.println("Ticket Month: " + ticketMonth);
        String ticketWeek = servletRequest.getParameter("ticketWeek");
        System.out.println("Ticket Week: " + ticketWeek);
        String ticketTime = servletRequest.getParameter("ticketTime");
        System.out.println("Ticket Time: " + ticketTime);
        String searchTicket = servletRequest.getParameter("searchTicket");
        System.out.println("Search Ticket: " + searchTicket);
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>order</title>");
        printWriter.println("</head>");
        printWriter.println("<h1> Hi,the</h1>"+subject);
        printWriter.println("<p style='color:green'>Ticket Is Raised to Solve it</p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
