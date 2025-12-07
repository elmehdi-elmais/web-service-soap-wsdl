package com.ws;

import java.util.Date;
import java.util.List;

public class Account {
    private int code;
    private int balance;
    private Date dateCreated;
    public Account(int code, int balance, Date dateCreated) {
        this.code = code;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
