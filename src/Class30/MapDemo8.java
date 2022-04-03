package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo8 {

    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.0);
        fruitMap.put("Kiwi", 105.5);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 10.2);

        Iterator<Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String , Double> entry= iterator.next();
            if(entry.getKey().endsWith("e") || entry.getValue()>=20){
                iterator.remove();
            }

            }
        System.out.println(fruitMap);
        }


}
