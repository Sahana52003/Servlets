package com.xworkz.formvalidation.form.dto;

import java.util.Objects;

public class FormDTO {
    private String name;
    private String email;
    private String password;
    private String mobile;
    private String dob;

    public FormDTO(String name, String email, String password, String mobile, String dob) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FormDTO formDTO = (FormDTO) o;
        return mobile == formDTO.mobile && Objects.equals(name, formDTO.name) && Objects.equals(email, formDTO.email) && Objects.equals(password, formDTO.password) && Objects.equals(dob, formDTO.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, mobile, dob);
    }

    @Override
    public String toString() {
        return "FormDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile=" + mobile +
                ", dob='" + dob + '\'' +
                '}';
    }
}
