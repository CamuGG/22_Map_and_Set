package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> monthAndDay = new LinkedHashMap<>();
        monthAndDay.put("January", 1);
        monthAndDay.put("February", 2);
        monthAndDay.put("March", 3);
        monthAndDay.put("April", 4);
        monthAndDay.put("May", 5);
        monthAndDay.put("June", 6);
        monthAndDay.put("July", 7);
        monthAndDay.put("August", 8);
        monthAndDay.put("September", 9);
        monthAndDay.put("October", 10);
        monthAndDay.put("November", 11);
        monthAndDay.put("December", 12);

        Set<String> keyMap = monthAndDay.keySet();
        System.out.println("key of the map: " + keyMap);

        List<Integer> valuesMap = new ArrayList<>(monthAndDay.values());
        System.out.println("value of the map's key: " + valuesMap);

        Integer[] arrayMonthAndDay = new Integer[monthAndDay.size()];
        monthAndDay.values().toArray(arrayMonthAndDay);
        System.out.println("print array of integer: " + Arrays.toString(arrayMonthAndDay));
    }
}
