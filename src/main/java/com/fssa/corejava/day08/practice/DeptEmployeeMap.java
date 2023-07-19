package com.fssa.corejava.day08.practice;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptEmployeeMap {
    public static void main(String[] args) {
        String input = "HR,Ram HR,Suresh IT,Basker IT,Joseph Admin,Sundar";

        // Split the input by spaces and commas and trim any extra spaces
        String[] deptEmpPairs = input.split("\\s+|\\s*,\\s*");
      //  System.out.println(Arrays.toString(deptEmpPairs));

        HashMap<String, List<String>> deptEmployeeMap = new HashMap<>();
        for (int i = 0; i < deptEmpPairs.length; i += 2) {
            String deptName = deptEmpPairs[i];
            String employeeName = deptEmpPairs[i + 1];

            deptEmployeeMap.putIfAbsent(deptName, new ArrayList<>());
            deptEmployeeMap.get(deptName).add(employeeName);
        }

        for (Map.Entry<String, List<String>> entry : deptEmployeeMap.entrySet()) {
            String deptName = entry.getKey();
            List<String> employees = entry.getValue();

            System.out.println(deptName + ": " + String.join(", ", employees));
        }
    }
}

