package Class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.0);
        fruitMap.put("Kiwi", 105.5);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        Iterator<String> iterator = fruitMap.keySet().iterator();

        while (iterator.hasNext()) {
            String Key = iterator.next();
            Double value = fruitMap.get(Key);
            if (Key.contains("e") && value >= 20) {
                iterator.remove();
            }
        }


        System.out.println(fruitMap);
    }
}
