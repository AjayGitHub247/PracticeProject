package OverLoading;

public class CarsOverLoading1 {
	
	// Method Overloading - When number of parameter could be different 

	public static void main(String[] args) {
		studentDetails("Ajay");
		studentDetails("Ajay", "Kumar", true);

	}
	
	public static void studentDetails(String fName) {
		System.out.println("The Stadent First Name is : " + fName);
	}
	
	public static void studentDetails(String fName, String lName, boolean nameSaved) {
		System.out.println("The Student Name is : " + fName + " " + lName);
		if(nameSaved) {
			System.out.println("Complete name is saved");
		} else {
			System.out.println("Complete name is not saved");
		}
			
	}

}
