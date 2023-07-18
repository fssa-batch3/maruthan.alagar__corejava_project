package com.fssa.corejava.day06.solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
    	
    	
    	String[] args1 = new String[7];
    	args1[0] = "Maruthan"; 
    	args1[1] = "Vignesh"; 
    	args1[2] = "Ram"; 
    	args1[3] = "Mathi"; 
    	args1[4] = "Santhosh"; 
    	args1[5] = "Siva"; 
    	args1[6] = "Dhanush"; 
        List<String> list = Arrays.asList(args1);
        Collections.shuffle(list);
        System.out.println(list);
    }
}