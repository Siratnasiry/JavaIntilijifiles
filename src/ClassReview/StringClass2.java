package ClassReview;

public class StringClass2 {
    public static void main(String[] args) {
        String student ="Teyfur";
        //student.startsWith("T"); // this is a written type boolean one method
        System.out.println(student.startsWith("T"));
        System.out.println(student.toLowerCase().startsWith("T"));
        System.out.println(student.endsWith("r"));
        System.out.println(student.contains("y")); // if y is avilabel or not

        String name = " habib";
        char output =name.charAt(2);
        System.out.println(output);
    }
}
