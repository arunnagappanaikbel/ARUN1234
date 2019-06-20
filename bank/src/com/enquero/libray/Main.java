package com.enquero.libray;

public class Main {

    public static void main(String[] args) {
        Account a1=new Account(123455, "arun",20000);
        //a1.insert(832345,"Ankit",10000);
        a1.display();
        a1.checkBalance();
        a1.deposite(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
        a1.display();
    }
}
