package Class30;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {
//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
        HashMap<Integer, String> building = new HashMap<>();

        building.put(1, "Google");
        building.put(2, "Apple");
        building.put(3, "Tesla");
        building.put(4, "Amazon");
        building.put(5, "Ford");
        building.put(6, "Ford");
        building.put(5, "Sony");
        building.put(7, "StarBucks");
        building.put(1, "Macey's");

        System.out.println(building.size());
        System.out.println(building);
        building.replace(4, "Facebook"); //update the value
        System.out.println(building);
        building.replace(41, "Mac"); //bcz there is no 41 key
        System.out.println(building);
        building.remove(7);
        System.out.println(building);


    }
}
