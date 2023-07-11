package com.fssa.corejava.day01.practice;

public class Cat {
	// Attributes
	private boolean hasSharpNails;
	private String color;

	// Getters and setters
	public boolean hasSharpNails() {
		return hasSharpNails;
	}

	public void SetHasSharpNails(boolean hasnails) {
		this.hasSharpNails = hasnails;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Dog objects
		Cat cat1 = new Cat();
		cat1.setColor("Sandle");
		cat1.SetHasSharpNails(false);
		Cat cat2 = new Cat();
		cat2.setColor("Grey");
		cat2.SetHasSharpNails(true);

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Has Sharp Nails: " + cat1.hasSharpNails());
		System.out.println("Color: " + cat1.getColor());

		System.out.println("Cat 2:");
		System.out.println("Has Sharp Nails: " + cat2.hasSharpNails());
		System.out.println("Color: " + cat2.getColor());
	}

}
