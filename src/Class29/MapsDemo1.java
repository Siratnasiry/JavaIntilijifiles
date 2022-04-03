package Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhammad");
        System.out.println(names.get(0));


        HashMap<Integer, String> map=new HashMap<>();
        map.put(123456777,"Asghar Nazir");
        map.put(123456, "Muhammad");
        System.out.println(map.get(1234444));// we get null output
        System.out.println(map.get(123456));
    }
}
