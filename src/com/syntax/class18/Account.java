package com.syntax.class18;

public class Account {

    private String username="Hassan";
    private String password="abcd123";
    public String accountNumber= "5678";
    private double balance=-3000;

    private void printUserName(){
        System.out.println("Username: "+username);
    }

    protected void printPassword(){
        System.out.println("Password: "+password);
    }

    public void printAccountNumber(){
        System.out.println("Account number: "+accountNumber);
    }

    void printBalance(){
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {

        Account account=new Account();

        System.out.println(account.username);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accountNumber);

        account.printUserName();
        account.printPassword();
        account.printAccountNumber();
        account.printBalance();
    }

}
