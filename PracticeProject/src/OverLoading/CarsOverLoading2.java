package OverLoading;

public class CarsOverLoading2 {
	
	// Method Overloading - When data type of the parameter could be different 
	
	public static void main(String[] args) {
		
		studentHeight(5);
		studentHeight("6.1");
	
	}
	
	public static void studentHeight(int height) {
		System.out.println("The height of the student : " + height + " I am the Integer one");
	}
	
	public static void studentHeight(String height) {
		System.out.println("The height of the student : " + height + " I am the String one");
	}
	
}
