package com.syntax.class18;

public class AccountTester {

    public static void main(String[] args) {

        Account account=new Account();

//        System.out.println(account.username);
//        System.out.println(account.password);
//        System.out.println(account.balance);
        //all the above are inaccessible from another class

        System.out.println(account.accountNumber); //public

        //account.printUserName();
        // error: PRIVATE ACCESS, can't access it form another class
        account.printPassword();
        account.printAccountNumber();
        account.printBalance();
    }

}
