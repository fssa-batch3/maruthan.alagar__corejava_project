package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateTasksFromArrayList {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		List<String> uniqueCityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		cityList.add("Chennai");

		for (int i = 0; i < cityList.size(); i++) {

			String currentCity = cityList.get(i);
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (cityList.get(j).equals(currentCity)) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				uniqueCityList.add(i, currentCity);
			}
		}

		System.out.println("Unique City List is Ready to Excute ");
		for (String city : uniqueCityList) {
			System.out.println(city);
		}

	}

}
