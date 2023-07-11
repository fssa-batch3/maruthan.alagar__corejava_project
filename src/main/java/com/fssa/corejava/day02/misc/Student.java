package com.fssa.corejava.day02.misc;

public class Student {
	@Override
	public String toString() {
		return "Student Details : Name = " + name + ", Id = " + id + ", Email = " + email +", Academy = "+academy;
	}

	String name;
	int id;
	String email;
	public static String academy;
	static int count = 0;
	
	public Student(){
		Student.count +=1; 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getAcademy() {
		return academy;
	}
	
	static { // Static initialization block
		
		academy = "FSSA";
	}
	
	

	
	

}
