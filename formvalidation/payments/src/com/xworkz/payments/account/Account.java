package com.xworkz.payments.account;

import com.xworkz.payments.account.dto.PaymentDTO;
import com.xworkz.payments.account.service.PaymentService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/payment",loadOnStartup = 8)
public class Account extends GenericServlet {
    public Account() {
        System.out.println("Account Details");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        String name = servletRequest.getParameter("name");
        System.out.println("Card Holder Name: " + name);
        String card = servletRequest.getParameter("card");
        System.out.println("Card Number: " + card);
        String password = servletRequest.getParameter("password");
        System.out.println("PIN: " + password);
        String expiry = servletRequest.getParameter("expiry");
        System.out.println("Expiry Month: " + expiry);
        String amount = servletRequest.getParameter("amount");
        System.out.println("Amount: " + amount);
        String method = servletRequest.getParameter("method");
        System.out.println("Payment Method: " + method);
        String email = servletRequest.getParameter("email");
        System.out.println("Email: " + email);
        String mobile = servletRequest.getParameter("mobile");
        System.out.println("Mobile: " + mobile);
        String ok = servletRequest.getParameter("ok");
        System.out.println("Agreed Terms: " + ok);
        String currency = servletRequest.getParameter("currency");
        System.out.println("Currency: " + currency);
        PrintWriter printWriter = servletResponse.getWriter();
        Double amt=Double.parseDouble(amount);
        PaymentDTO paymentDTO=new PaymentDTO(name,card,password,expiry,amount,method,email,mobile,currency);
        PaymentService paymentService = new PaymentService();
        boolean isValidate = paymentService.checkData(paymentDTO);
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>payment send</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>" + name);
            printWriter.println("<p style='color:green'>Payed Amount is Success</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Payments</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>");
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
}