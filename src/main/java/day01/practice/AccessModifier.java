package day01.practice;

public class AccessModifier {
	private static String a = "a";
	public static String b = "b";
	protected static String c = "c";
	static String d = "d";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

//- public - access anywhere
//- private - access within the same class
//- default (no access modifier given) - (package-private) - access within the same package
//- protected - Access within the same class and Subclasses of the class also.

// Static variable - the variable belongs to the class itself rather than to any specific instance of the class