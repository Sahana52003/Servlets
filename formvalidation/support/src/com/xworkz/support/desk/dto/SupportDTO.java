package com.xworkz.support.desk.dto;

import java.util.Objects;

public class SupportDTO {
    private String subject;
    private String description;
    private String email;
    private String phone;
    private String docs;
    private String department;
    private String comments;
    private String ticketDate;
    private String ticketMonth;
    private String ticketWeek;
    private String ticketTime;
    private String searchTicket;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketMonth() {
        return ticketMonth;
    }

    public void setTicketMonth(String ticketMonth) {
        this.ticketMonth = ticketMonth;
    }

    public String getTicketWeek() {
        return ticketWeek;
    }

    public void setTicketWeek(String ticketWeek) {
        this.ticketWeek = ticketWeek;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public String getSearchTicket() {
        return searchTicket;
    }

    public void setSearchTicket(String searchTicket) {
        this.searchTicket = searchTicket;
    }

    @Override
    public String toString() {
        return "SupportDTO{" +
                "subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", docs='" + docs + '\'' +
                ", department='" + department + '\'' +
                ", comments='" + comments + '\'' +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketMonth='" + ticketMonth + '\'' +
                ", ticketWeek='" + ticketWeek + '\'' +
                ", ticketTime='" + ticketTime + '\'' +
                ", searchTicket='" + searchTicket + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SupportDTO that = (SupportDTO) o;
        return phone == that.phone && Objects.equals(subject, that.subject) && Objects.equals(description, that.description) && Objects.equals(email, that.email) && Objects.equals(docs, that.docs) && Objects.equals(department, that.department) && Objects.equals(comments, that.comments) && Objects.equals(ticketDate, that.ticketDate) && Objects.equals(ticketMonth, that.ticketMonth) && Objects.equals(ticketWeek, that.ticketWeek) && Objects.equals(ticketTime, that.ticketTime) && Objects.equals(searchTicket, that.searchTicket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, description, email, phone, docs, department, comments, ticketDate, ticketMonth, ticketWeek, ticketTime, searchTicket);
    }

    public SupportDTO(String subject, String description, String email, String phone, String docs, String department, String comments, String ticketDate, String ticketMonth, String ticketWeek, String ticketTime, String searchTicket) {
        this.subject = subject;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.docs = docs;
        this.department = department;
        this.comments = comments;
        this.ticketDate = ticketDate;
        this.ticketMonth = ticketMonth;
        this.ticketWeek = ticketWeek;
        this.ticketTime = ticketTime;
        this.searchTicket = searchTicket;
    }
}
