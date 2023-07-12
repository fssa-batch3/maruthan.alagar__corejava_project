package com.fssa.corejava.day03.practice;

public class Employee {

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
