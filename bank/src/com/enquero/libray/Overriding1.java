package com.enquero.libray;

public class Overriding1 {
}
class bank{
    int getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends bank{
    int getRateOfInterest()
    {
        return 9;
    }
}
class ICICI extends bank{
    int getRateOfInterest()
    {
        return 8;
    }
}
class VIJAYA extends bank{

    int getRateOfInterest()
    {
        return 7;
    }
  }
class test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        VIJAYA  v= new VIJAYA();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("VIJAYA Rate of Interest: "+v.getRateOfInterest());
    }
}