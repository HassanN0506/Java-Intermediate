package com.syntax.class33;

public class Account {

    double balance;

    public void setBalance(double balance) {
        if (balance<0) {
            throw new InsufficientBalance("can't set negative balance");
        }else{
            this.balance=balance;
        }
    }

}
