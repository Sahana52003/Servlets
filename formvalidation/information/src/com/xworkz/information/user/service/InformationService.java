package com.xworkz.information.user.service;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.xworkz.information.user.dto.InformationDTO;

public class InformationService {
    public boolean checkData(InformationDTO informationDTO) {
        if (informationDTO.getFirstName().length()>=4&&informationDTO.getLastName().length()>1&&
        informationDTO.getEmail()!=null&&informationDTO.getPassword().length()>8
        && informationDTO.getAge().length()>=18 && informationDTO.getMobile().length()==10&&
        informationDTO.getDob()!=null && informationDTO.getGender()!=null
        && informationDTO.getCountry()!=null && informationDTO.getAddress().length()>13) {
            return true;
        }
        return false;
    }
}