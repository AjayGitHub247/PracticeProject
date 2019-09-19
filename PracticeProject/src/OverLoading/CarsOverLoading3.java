package OverLoading;

public class CarsOverLoading3 {
	
	// Method Overloading - When sequence of data type can be different 

	public static void main(String[] args) {
		studentDetails("Bimal", 6);
		studentDetails(5, "Ajay");

	}
	
	public static void studentDetails(String fName, int height) {
		System.out.println("The Student Name is : " + fName + " and the height is : " + height);
	}
	
	public static void studentDetails(int height, String fName) {
		System.out.println("The Student Height  is : " + height + " and the Name is : " + fName);
	}

}
