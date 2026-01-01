package com.xworkz.website.shop.service;

import com.xworkz.website.shop.dto.WebsiteDTO;

public class WebsiteService {

    public boolean checkStatus(WebsiteDTO websiteDTO) {

        if (websiteDTO != null
                && websiteDTO.getProduct() != null
                && websiteDTO.getQuantity() != null
                && websiteDTO.getName() != null
                && websiteDTO.getName().length() > 4
                && websiteDTO.getMobile() != null
                && websiteDTO.getMobile().length() == 10
                && websiteDTO.getEmail() != null
                && websiteDTO.getPassword() != null
                && websiteDTO.getShipping() != null) {

            return true;
        }
        return false;
    }
}
