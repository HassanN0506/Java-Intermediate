package com.syntax.class30;

/*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building = new LinkedHashMap<>();
        //building.put(1, "Google");
        building.put(1, "Boogle");
        building.put(2, "Syntax");
        building.put(3, "Amazon");
        building.put(4, "Tesla");
        building.put(5, "Amazon");
        building.put(6, "Google");
        building.put(7, "Syntax");
        System.out.println(building);

        System.out.println(building.size());

        building.replace(4, "Facebook");

        building.remove(7);

        System.out.println(building);
    }
}
