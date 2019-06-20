package com.enquero.libray;

public class inheritence {    // single level inheritence
    void m1(){
        System.out.println("inside m1");
    }

    public static void main(String[] args) {
        inheritence obj= new inheritence();
        obj.m1();
        obj.hashCode(); // inherit from d default called java.lang.object
        obj.getClass();
        child obj2 = new child();
        obj2.fun2();
        obj2.fun1(); // inherit from the parent class
    }
}
class parent{
    void fun1(){
        System.out.println("inside parent class");
    }
}
class child extends parent{
    void fun2(){
        System.out.println("inside child class");
    }
}
