package Class30;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        // fruitMap.put(Apple,20); auto casting doesn't work in collection and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.5);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Banana",12.5); // duplicate values are overwritten last value is retained
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi")); // case sensitive
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("Horse"));
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana",50.5);
        System.out.println(fruitMap);


    }
}