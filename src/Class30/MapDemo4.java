package Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.5);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        Collection<Double> values =fruitMap.values();

        System.out.println(values);

        Iterator<Double> iterator= values.iterator();
        while (iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
