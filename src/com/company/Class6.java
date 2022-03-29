package com.company;

public class Class6 {
    // Write Book class that will have instance variables and 2
    // Constructors. While creating an object make sure:
    String bookName;
    double price;

    public Class6 ( ) {
        System.out.println(" No argument constructor");
    }
    public Class6 (String bookName, double price){

        this ();
        this.bookName=bookName;
        this.price=price;

        System.out.println(" two argument constructor");
    }
}
