package com.company;

public class Parent {

    private String name; // private member dont participate in inheretance
    int age;
    protected double weight;
    public String color;
}

class Child extends Parent{
    void printInfo(){
        // System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }


}
