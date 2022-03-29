package Class21;

public class SuperKeyWordDemo {

    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class Parent{
    String color="Black";
}
class Child extends Parent{
    String color="Red";

    void printColor(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
