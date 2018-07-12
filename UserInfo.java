package com.twimi.documentmanager.Model;

import lombok.Data;

@Data
public class UserInfo {
    private int uid;
    private String company;
    private String title;
    private String position;
    private String phone;
    private String email;
    private String wechat;
}
