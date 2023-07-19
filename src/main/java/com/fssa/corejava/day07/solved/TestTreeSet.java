package com.fssa.corejava.day07.solved;

import java.util.TreeSet;

public class TestTreeSet {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
        TreeSet<String> cityNames = new TreeSet<String>();
        cityNames.add("Delhi");  //3
        cityNames.add("Chennai");  //2
        cityNames.add("Bangalore"); //1
 
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
         
         
    }
 
}