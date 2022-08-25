package com.jap.customexception;

public class AccountMain {
    public static void main(String[] args) {


        Account obj = new Account(5000);

        try {
            System.out.println("updated balance =" + obj.withdraw(500));
        } catch (InsufficientFundException e) {
            System.out.println(e);
            e.printStackTrace();

        }
    }
}
