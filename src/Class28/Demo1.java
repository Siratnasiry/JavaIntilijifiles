package Class28;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
//    courses.clear();
        System.out.println(courses);
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals("Java")) {
                courses.set(i, "Happy");
                System.out.println(courses);  //replace all Java for example
            }

        }
    }
}
