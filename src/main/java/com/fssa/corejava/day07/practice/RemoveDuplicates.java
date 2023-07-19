package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {

		ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
		numbersWithDuplicates.add(1);
		numbersWithDuplicates.add(2);
		numbersWithDuplicates.add(3);
		numbersWithDuplicates.add(2);
		numbersWithDuplicates.add(4);
		numbersWithDuplicates.add(1);

		HashSet<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);

		System.out.println("Unique numbers:");
		for (Integer number : uniqueNumbers) {
			System.out.println(number);
		}
	}
}
