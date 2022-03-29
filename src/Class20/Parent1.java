package Class20;

public class Parent1 {
    String name="parent";
    void printName() {
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name="Child";
    void printName() {
        String name="Tyfour";// first priority is given to local variables
        System.out.println(name);
        //* when we use this Keyword even though we have a local variable Java will only
        // bring the values from instance variables

        System.out.println(this.name);
        //*when we use this Keyword even though we have a local variable Java will only
        // bring the values from instance variables inside the same class , Java will only
        // bring the values from parent class instance variables

        System.out.println(super.name);
    }
}
class ParentTester {
    public static void main(String[] args) {
        Child1 Child1=new Child1();
        Child1.printName();
    }
}