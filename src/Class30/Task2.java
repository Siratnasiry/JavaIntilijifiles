package Class30;

import java.util.*;

public class Task2 {
    //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
    public static void main(String[] args) {
        TreeMap<String, String> Countries = new TreeMap<>();
        Countries.put("Afghanistan", "Kabul");
        Countries.put("Canada", "Toranto");
        Countries.put("Pakistan", "Islamabad");
        Countries.put("Turkey", "Istanbol");
        Countries.put("US", "WDC");
//Part I
        for (Map.Entry<String, String> entry : Countries.entrySet()) {
            System.out.println(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator = Countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
        }
//Part II
        for (String value : Countries.values()) {
            System.out.println(value);

        }
        Iterator<String> iterator1 = Countries.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}