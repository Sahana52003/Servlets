package com.xworkz.website.shop.dto;

import java.util.Objects;

public class WebsiteDTO {
    private String product;
    private String quantity;
    private String name;
    private String password;
    private String email;
    private String mobile;
    private String shipping;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }


    @Override
    public String toString() {
        return "WebsiteDTO{" +
                "product='" + product + '\'' +
                ", quantity='" + quantity + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", shipping='" + shipping + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WebsiteDTO that = (WebsiteDTO) o;
        return  Objects.equals(product, that.product) && Objects.equals(quantity, that.quantity) && Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(mobile, that.mobile) && Objects.equals(shipping, that.shipping) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity, name, password, email, mobile, shipping);
    }

    public WebsiteDTO(String product, String quantity, String name, String password, String email, String mobile, String shipping) {
        this.product = product;
        this.quantity = quantity;
        this.name = name;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.shipping = shipping;
    }
}
