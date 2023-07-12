package com.fssa.corejava.day03.practice;

public class App {
	
	
	public static void main(String[] args) {
		User user1 = new User(); 
	user1.setName("Maruthan Alagar");
	user1.setPassword("password123");
	user1.setEmailId("maruthan@gmail.com");

	User user2 = new User("Maruthan", "password456", "maruthanalagar@gmail.com"); 

	System.out.println(user1.toString()); 
	System.out.println(user2.toString());
	}
	 

}
