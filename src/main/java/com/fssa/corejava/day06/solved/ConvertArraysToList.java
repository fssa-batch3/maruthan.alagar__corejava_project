package com.fssa.corejava.day06.solved;

import java.util.Arrays;
import java.util.List;

public class ConvertArraysToList {
	public static void main(String[] args) {
		String[] deptNames = new String[4
		                                ];
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
		deptNames[3] = "IT";
		List<String> list = Arrays.asList(deptNames);
		System.out.println(list);
	}

}
