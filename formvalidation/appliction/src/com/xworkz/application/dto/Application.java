package com.xworkz.application.dto;

import java.util.Objects;

public class Application {
    private String name;
    private String id;
    private String email;
    private int mobile;
    private String password;
    private String documents;
    private String choose;
    private String address;
    private String dob;
    private String month;
    private String week;
    private String docs;
    private String time;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return mobile == that.mobile && age == that.age && Objects.equals(name, that.name) && Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(documents, that.documents) && Objects.equals(choose, that.choose) && Objects.equals(address, that.address) && Objects.equals(dob, that.dob) && Objects.equals(month, that.month) && Objects.equals(week, that.week) && Objects.equals(docs, that.docs) && Objects.equals(time, that.time) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email, mobile, password,documents, choose, address, dob, month, week, docs, time, color, age);
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", password='" + password + '\'' +
                ", documents='" + documents + '\'' +
                ", choose='" + choose + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", month='" + month + '\'' +
                ", week='" + week + '\'' +
                ", docs='" + docs + '\'' +
                ", time='" + time + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public Application(String name, String id, String email, int mobile, String password, String indian, String nonResident, String documents, String choose, String address, String dob, String month, String week, String docs, String time, String color, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.documents = documents;
        this.choose = choose;
        this.address = address;
        this.dob = dob;
        this.month = month;
        this.week = week;
        this.docs = docs;
        this.time = time;
        this.color = color;
        this.age = age;
    }
}
