package Class28;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {

    //  String[] friendsArray=new String[6];

      String[] friendsArray= {"Hawa","Gul","Asel","Naz","John","Gold"};

     // ArrayList<String> friendsArrayList=new ArrayList<>();

      ArrayList<String> friendsArrayList= new ArrayList<>(Arrays.asList("Hawa","Gul","Asel","Naz","John","Gold"));

      System.out.println(friendsArray[1]);
      System.out.println(friendsArrayList.get(1));
        System.out.println(friendsArrayList.size());
        System.out.println(friendsArray.length);
        friendsArrayList.add("Sam");
        System.out.println(friendsArrayList.get(6));

        friendsArrayList.set(0,"Star");
        System.out.println(friendsArrayList.get(0));
        System.out.println(friendsArrayList);

        friendsArrayList.remove("Gul");
        System.out.println(friendsArrayList.get(1));







    }
}