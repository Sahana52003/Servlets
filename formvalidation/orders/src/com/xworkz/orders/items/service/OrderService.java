package com.xworkz.orders.items.service;

import com.xworkz.orders.items.dto.OrderDTO;

public class OrderService {
    public boolean checkData(OrderDTO orderDTO) {
        if (orderDTO.getName().length()>6&&orderDTO.getEmail()!=null
        &&orderDTO.getPhone().length()==10&&orderDTO.getRatings()!=null
        &&orderDTO.getCategory()!=null) {
            return true;
        }
        return false;
    }
}