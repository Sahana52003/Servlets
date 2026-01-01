package com.xworkz.management.signup.dto;

import java.util.Objects;

public class ManagementDTO {
    private String employeeId;
    private String name;
    private String salary;
    private String department;
    private String role;

    public ManagementDTO(String employeeId, String name, String salary, String department, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ManagementDTO that = (ManagementDTO) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(department, that.department) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, salary, department, role);
    }

    @Override
    public String toString() {
        return "ManagementDTO{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
