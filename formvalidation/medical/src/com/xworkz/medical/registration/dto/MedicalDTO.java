package com.xworkz.medical.registration.dto;

import java.util.Objects;

public class MedicalDTO {
    private String name;
    private String age;
    private String gender;
    private String date;
    private String bloodGroup;
    private String email;
    private String phone;

    public MedicalDTO(String name, String age, String gender, String date, String bloodGroup, String email, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.date = date;
        this.bloodGroup = bloodGroup;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MedicalDTO that = (MedicalDTO) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(date, that.date) && Objects.equals(bloodGroup, that.bloodGroup) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, date, bloodGroup, email, phone);
    }

    @Override
    public String toString() {
        return "MedicalDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

