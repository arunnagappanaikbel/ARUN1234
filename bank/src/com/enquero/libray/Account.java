package com.enquero.libray;

public class Account {
    int acc_no;
    String name;
    float amount;
    /*void insert(int a, String b,float amt){
        acc_no=a;
        name=b;
        amount=amt;
    }*/
    Account(int acc_no, String name,float amount){
        this.acc_no=acc_no;
        this.name=name;
        this.amount=amount;
    }
    void deposite(float amt){
        amount= (amount+ amt);
       System.out.println(amt + "deposited");
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }
        else
        {
            amount=amount-amt;
            System.out.println(amt + "withdrawn");
        }
          }
        void display(){System.out.println("account status is "+acc_no+" "+name+" "+amount);}
    void checkBalance(){System.out.println("Balance is: "+amount);}
}

