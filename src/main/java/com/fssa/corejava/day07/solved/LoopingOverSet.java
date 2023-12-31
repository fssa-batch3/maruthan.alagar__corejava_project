package com.fssa.corejava.day07.solved;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class LoopingOverSet {

	public static void main(String[] args) {

		Set<String> cityNames = new HashSet<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");

		// Method 1: Using foreach
		System.out.println("Using for Each:");
		for (String cityName : cityNames) {
			System.out.print(cityName + " ");

		}
		System.out.println();
		System.out.println();
		// Method 2: Using Iterator class
		System.out.println("Using Iterator class:");
		Iterator<String> iterator = cityNames.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
