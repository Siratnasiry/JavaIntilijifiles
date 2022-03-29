package Class21;

import java.sql.SQLOutput;

public class MethodOverLoadingDemo {
    void printInfo( String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }

    void printInfo( int age,String name, double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo( int age,double weight, String name){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo( double weight, String name, int age){
        System.out.println("M4");
        System.out.println(name+" "+age+" "+weight);
    }
    public static void main(String[] args) {
        MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
        obj.printInfo("Lilya", 16, 28.0);
        obj.printInfo(16, "Zak", 28.0);
        obj.printInfo(16, 28.0, "Ahmad");
        obj.printInfo((int) 28.0, 16, "Mahmod");

    }
}

