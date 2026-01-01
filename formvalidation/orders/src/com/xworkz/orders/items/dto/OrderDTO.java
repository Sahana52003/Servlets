package com.xworkz.orders.items.dto;

import java.util.Objects;

public class OrderDTO {

    private String name;
    private String email;
    private String phone;
    private String ratings;
    private String category;

    public OrderDTO(String name, String email, String phone, String ratings, String category) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.ratings = ratings;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getRatings() {
        return ratings;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(name, orderDTO.name) &&
                Objects.equals(email, orderDTO.email) &&
                Objects.equals(phone, orderDTO.phone) &&
                Objects.equals(ratings, orderDTO.ratings) &&
                Objects.equals(category, orderDTO.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, ratings, category);
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", ratings='" + ratings + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
