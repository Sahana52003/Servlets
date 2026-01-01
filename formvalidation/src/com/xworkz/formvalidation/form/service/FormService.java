package com.xworkz.formvalidation.form.service;

import com.xworkz.formvalidation.form.dto.FormDTO;

public class FormService {
    public boolean checkData(FormDTO formDTO){
        if(formDTO.getName().length()>5&&formDTO.getEmail()!=null
        &&formDTO.getPassword()!=null&&formDTO.getDob()!=null&&
        formDTO.getMobile().length()==10){
            return true;
        }
        return false;
    }
}
