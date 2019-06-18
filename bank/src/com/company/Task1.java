package com.company;

public class Task1 {
    void add (int a, int b){
        int result = a + b;
        System.out.println("result is " + result);

    }
    void add (int a, int b, int c){
        int result = a + b + c;
        System.out.println("result is " + result);

    }
    void add (float a, float b){
        float result = a + b;
        System.out.println("result is " + result);

    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.add(3,4);
        obj.add(2,3,4);
        obj.add(2.1f,2.2f);

    }
}
