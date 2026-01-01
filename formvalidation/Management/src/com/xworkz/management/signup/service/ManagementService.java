package com.xworkz.management.signup.service;

import com.xworkz.management.signup.dto.ManagementDTO;

public class ManagementService {
    public boolean checkData(ManagementDTO managementDTO) {
        if (managementDTO.getEmployeeId().length()>5&&managementDTO.getName()!=null
        && managementDTO.getSalary().length()>10000&&managementDTO.getDepartment()!=null
        && managementDTO.getRole()!=null) {
            return true;
        }
        return false;
    }
}