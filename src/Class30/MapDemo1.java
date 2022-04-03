package Class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
//fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);
        fruitMap.put("Banana", 12.5); // duplicate values are overwritten
        System.out.println(fruitMap);

    }
}