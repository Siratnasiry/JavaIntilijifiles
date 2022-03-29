package Class28;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds= new HashMap<>();

        empIds.put("Lize", 12345);
        empIds.put("Nazgul",56788);
        empIds.put("Cheryl", 4654555);

        System.out.println(empIds);
        System.out.println(empIds.get("Nazgul"));
        System.out.println(empIds.containsValue("3445678"));
        System.out.println(empIds.containsValue("6"));
        System.out.println(empIds.containsKey("Guldan"));

        empIds.put("Nazgul" ,1234);
        System.out.println(empIds);
        empIds.replace("Nazgul",6666);
        System.out.println(empIds);

    }
}
