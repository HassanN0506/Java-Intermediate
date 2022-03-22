package com.syntax.class25;

public class BankAccount {
    private double balance=12000;
    private String username="Habib";
    private String password="Habib123";

    void printBalance(String username, String password){
        if(username.equalsIgnoreCase(this.username) && password.equalsIgnoreCase(this.password)){
            System.out.println(balance);
        } else {
            System.out.println("incorrect username or password");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
