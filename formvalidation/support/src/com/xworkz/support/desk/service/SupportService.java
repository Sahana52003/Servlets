package com.xworkz.support.desk.service;

import com.xworkz.support.desk.dto.SupportDTO;

public class SupportService{
    public boolean checkStatus(SupportDTO supportDTO) {

        if (supportDTO.getSubject() != null
                && supportDTO.getSubject().length() >= 5
                && supportDTO.getDescription() != null
                && supportDTO.getDescription().length() >= 10
                && supportDTO.getEmail() != null
                && supportDTO.getPhone().length() ==10
                && supportDTO.getDepartment() != null
                && supportDTO.getTicketDate() != null
                && supportDTO.getTicketMonth() != null
                && supportDTO.getTicketWeek() != null
                && supportDTO.getTicketTime() != null) {

            return true;
        }
        return false;
    }

}
