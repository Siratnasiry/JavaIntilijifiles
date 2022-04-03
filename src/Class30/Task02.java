package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task02 {
//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
    public static void main(String[] args) {
        HashMap<String, String> Countries = new HashMap<>();
        Countries.put("Afghanistan", "Kabul");
        Countries.put("Canada", "Toranto");
        Countries.put("Pakistan", "Islamabad");
        Countries.put("Turkey", "Istanbol");
        Countries.put("US", "WDC");

        System.out.println(Countries);

        System.out.println(Countries.keySet());
        System.out.println(Countries.values());
        System.out.println(Countries.entrySet());

        Iterator<Map.Entry<String, String>> iterator = Countries.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getKey());
            for (String Key : Countries.values()) {
                System.out.println(Key);

            }
        }
    }
}


