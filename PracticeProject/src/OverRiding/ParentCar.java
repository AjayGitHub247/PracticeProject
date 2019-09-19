package OverRiding;

public class ParentCar {
	
	public void getCarDetails(int i) {
		System.out.println("This is from Parent Class");
	}

	public void getNoOfCylinders(int cyl) {
		System.out.println("Numbers of Cylinders from Parent : " + cyl);
	}
	
	public static void increaseSpeed() {
		System.out.println("Static Method from Parent");
	}
	
}
