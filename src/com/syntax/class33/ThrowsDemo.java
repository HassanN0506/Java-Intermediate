package com.syntax.class33;

public class ThrowsDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.setBalance(-15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
