package Class25;

public interface Human {

    int legs=2;
    void walk();
    static void pringLegs(){

        System.out.println(legs);
    }
    public default void noNeedToWorry(){

         System.out.println("default methods are there to functional programming");

    }
}

interface LivingBeing{
    static void pringLegs(){
        System.out.println("Not sure");
    }
}
class Nazgul implements Human,LivingBeing {

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}