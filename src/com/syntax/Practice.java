package com.syntax;

import java.util.*;

public class Practice {
}


class Main {

    public static void main(String[] args) {

        List<Map<String,Object>> dataList = new LinkedList<>();

        LinkedHashMap<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        LinkedHashMap<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        for (Map<String,Object> map: dataList) {

            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
            }
        }


    }
}