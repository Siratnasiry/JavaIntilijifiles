package ClassReview;

public class Class2 {

    String generateUsername( String firstName, String lastName){

        return firstName+"123"+lastName+".com";

    }
    static void moreedDemand(){ // this is a method
        System.out.println(" This is morred's function");
    }

    public static void main(String[] args) {
        moreedDemand();
        Class2 obj= new Class2();
        System.out.println(obj.generateUsername("emilia","gulnar"));
    }
}
