package com.fssa.corejava.day08.practice;

import java.util.HashMap;
import java.util.Map;

public class CountNames {
    public static void main(String[] args) {
        String input = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";

        // Split the input by commas and trim any extra spaces
        String[] names = input.split("\\s*,\\s*");

        // Use a HashMap to count occurrences of each name
        HashMap<String, Integer> nameCountMap = new HashMap<>();
        for (String name : names) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Print the count of each name
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

