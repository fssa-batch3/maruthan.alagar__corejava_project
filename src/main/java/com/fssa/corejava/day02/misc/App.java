package com.fssa.corejava.day02.misc;

public class App {
	public static void main(String[] args) {
		Academy academy = new Academy();
		academy.setName("Freshworks STS Software Academy");
		academy.setId(0001);
		academy.setCode("FSSA");

		Student student1 = new Student();
		student1.setName("Maruthan Alagar");
		student1.setEmail("maruthan@fssa.freshworks.com");
		student1.setId(10096);

		Student student2 = new Student();
		student2.setName("Dhanush Selvam");
		student2.setEmail("dhanush@fssa.freshworks.com");
		student2.setId(10091);
		System.out.println("How Many Student Instances are created : " + Student.count);

		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}

}
