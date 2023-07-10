package day01.solved;

public class StaticVariableVsInstanceVariable {
	// Declare a static variable
	public static int staticVariable;

	public static void main(String[] args) {
		// Access the static variable using the class name
		StaticVariableVsInstanceVariable.staticVariable = 10;
		System.out.println(StaticVariableVsInstanceVariable.staticVariable);
	}

//	 // Declare an instance variable
//    public int instanceVariable;
//
//    public static void main(String[] args) {
//        // Create an object of MyClass
//    	StaticVariableVsInstanceVariable myObject = new StaticVariableVsInstanceVariable();
//
//        // Access the instance variable using the object reference
//        myObject.instanceVariable = 5;
//        System.out.println(myObject.instanceVariable);
//    }

}
