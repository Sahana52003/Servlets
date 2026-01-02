package com.xworkz.application.service;

import com.xworkz.application.dto.Application;

public class ApplicationService {
    public boolean checkData(Application application) {
        System.out.println("Checking data : " + application);
        if(application.getName().length()>4 && application.getId()!=null && String.valueOf(application.getMobile()).length()==10 &&
                application.getEmail()!=null && application.getPassword()!=null
        && application.getDocuments()!=null && application.getChoose()!=null && application.getAddress()!=null &&
                application.getDob()!=null && application.getMonth()!=null && application.getWeek()!=null
        && application.getDocs()!=null && application.getTime()!=null && application.getAge()>18){
         return true;
        }
        return false;
    }
}