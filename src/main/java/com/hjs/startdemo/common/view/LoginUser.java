package com.hjs.startdemo.common.view;

import lombok.Data;

@Data
public class LoginUser {

    private String code;
    private String userAccount;
    private String userName;
    private String emailAddress;
    private String emailPassword;

    public LoginUser() {
    }

    public LoginUser(String userAccount){
        this.userAccount = userAccount;
    }

}
