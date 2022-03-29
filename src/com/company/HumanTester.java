package com.company;

public class HumanTester {
    public static void main(String[] args) {
        Student Student=new Student();
        Student.name="hoar";
        System.out.println(Student.name);
        Student.printName();
        Student.StudentId="123";
        System.out.println("---------------------");
        Principle principle=new Principle();
        Principle.name="Gulden";
        System.out.println(principle.name);
        Principle.printName();
        principle.specialParkingSlot=false;


    }
}
