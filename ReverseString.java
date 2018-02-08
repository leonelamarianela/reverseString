package com.technosoft.selenium;


import org.testng.annotations.Test;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hope you are doing well";

        StringBuilder s1 = new StringBuilder();
        s1.append(s);

        s1 = s1.reverse();

        for (int i = 0; i < s1.length(); i++)
            System.out.print(s1.charAt(i));
    }

    @Test
    public void ItemContent() {

        ArrayList<String> foodName = new ArrayList<>();
        ArrayList<String> serving = new ArrayList<>();
        foodName.add(0, "Apple butter");
        foodName.add(1, "Apples fresh");
        foodName.add(2, "Applesouce, unsweetened");
        foodName.add(3, "Apples, dried");
        foodName.add(4, "Juice, Cranberry-Apple drink");

        serving.add(0, "1 tbsp");
        serving.add(1, "1 medium");
        serving.add(2, "1/2 cup");
        serving.add(3, "1/4 cup");
        serving.add(4, "8 fl oz");


        // a)	Display the third and fifth item from the above list. Your output should be:
        //Applesauce, unsweetened
        // Juice, Cranberry-apple drink

        //String fname = foodName.get(2);
        //String portions = foodName.get(4);
        System.out.println(foodName.get(2));
        System.out.println(foodName.get(4));

        //

        System.out.println("            ");
        System.out.println("  ");
        System.out.println("      ");
        System.out.println(" b)Fetch each food name and its servings and store them in a Map.Iterate through all the entries in the Map and print them.       ");

        System.out.println("HashMap : food name and its servings");

        HashMap<String, String> fMap = new HashMap<>();

        for (int i = 0; i < foodName.size(); i++) {
            fMap.put(foodName.get(i), serving.get(i));}

        for (HashMap.Entry<String, String> getItem : fMap.entrySet()) {
            System.out.println(getItem.getKey() + "           " + getItem.getValue());

          //  String f = getItem.getKey();
         //   String s = getItem.getValue();
          //  System.out.println(f + s);
            }


    }
}