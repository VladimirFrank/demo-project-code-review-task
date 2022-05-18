package com.frank.test.dto;

import java.util.List;

public class Account {
    private String number;
    private List<String> permittedUsers;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getPermittedUsers() {
        return permittedUsers;
    }

    public void setPermittedUsers(List<String> permittedUsers) {
        this.permittedUsers = permittedUsers;
    }
}
