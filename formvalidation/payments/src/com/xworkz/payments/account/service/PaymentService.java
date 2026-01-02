package com.xworkz.payments.account.service;

import com.xworkz.payments.account.dto.PaymentDTO;

public class PaymentService {
    public boolean checkData(PaymentDTO paymentDTO) {
        if (paymentDTO.getName().length()>7 && paymentDTO.getCardNumber() != null
                && paymentDTO.getPassword().length()>5
                && paymentDTO.getExpiry() != null
                && paymentDTO.getAmount().length() > 100
                && paymentDTO.getMethod() != null
                && (paymentDTO.getMethod().equalsIgnoreCase("Credit") || paymentDTO.getMethod().equalsIgnoreCase("Debit"))
                && paymentDTO.getEmail() != null
                && paymentDTO.getMobile().length()==10
                && paymentDTO.getCurrency() != null) {
            return true;
        }
        return false;
    }
}