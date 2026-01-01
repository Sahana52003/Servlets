package com.xworkz.login.auth.service;

import com.xworkz.login.auth.dto.LoginDTO;

public class LoginService {
    public boolean checkData(LoginDTO loginDTO) {
        if (loginDTO.getEmail()!=null&&loginDTO.getName().length()>5
        &&loginDTO.getPassword()!=null&&loginDTO.getPassword().length()>=8) {
            return true;
        }
        return false;
    }
}