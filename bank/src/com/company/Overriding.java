package com.company;

public class Overriding {
    public static void main(String[] args){
        parentClass obj1= new childClass();
        obj1.fun1();
        obj1.fun2();
    }
}
 class parentClass{

    void fun1(){
        System.out.println("this is parent class");
    }
    void fun2(){
        System.out.println("this is also inside parent class");
    }
}
class childClass extends parentClass{
    void fun1(){
        System.out.println("ur in child class");
    }
    void fun2(){
        System.out.println("inside the child class");
    }
}

