package Class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.0);
        fruitMap.put("Kiwi", 105.5);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        System.out.println(fruitMap.entrySet());
        for(Map.Entry<String,Double> entry : fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
