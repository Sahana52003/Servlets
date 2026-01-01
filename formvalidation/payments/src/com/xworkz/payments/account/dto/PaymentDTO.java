package com.xworkz.payments.account.dto;

import java.util.Objects;

public class PaymentDTO {
    private String name;
    private String cardNumber;
    private String password;
    private String expiry;
    private String amount;
    private String method;
    private String email;
    private String mobile;
    private String currency;

    public PaymentDTO(String name, String cardNumber, String password, String expiry, String amount, String method, String email, String mobile, String currency) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.password = password;
        this.expiry = expiry;
        this.amount = amount;
        this.method = method;
        this.email = email;
        this.mobile = mobile;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDTO that = (PaymentDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(password, that.password) && Objects.equals(expiry, that.expiry) && Objects.equals(amount, that.amount) && Objects.equals(method, that.method) && Objects.equals(email, that.email) && Objects.equals(mobile, that.mobile) && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cardNumber, password, expiry, amount, method, email, mobile, currency);
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                ", expiry='" + expiry + '\'' +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
