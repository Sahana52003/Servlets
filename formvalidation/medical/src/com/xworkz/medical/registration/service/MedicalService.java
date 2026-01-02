package com.xworkz.medical.registration.service;

import com.xworkz.medical.registration.dto.MedicalDTO;

public class MedicalService {
    public boolean checkData(MedicalDTO medicalDTO) {
        if (medicalDTO.getName()!=null&&medicalDTO.getAge().length()<=100
        &&medicalDTO.getGender()!=null&&medicalDTO.getDate()!=null
        &&medicalDTO.getBloodGroup()!=null
        &&medicalDTO.getEmail()!=null&&medicalDTO.getEmail().contains("@")&&
        medicalDTO.getPhone().length()==10) {
            return true;
        }
        return false;
    }
}