package OverRiding;

public class ChildCar extends ParentCar {
	
	/***
	 * 1. arguments list should be same in overriding method 1. Access modifier can not be lower than parent class method
	 * 2. private, static and final method cannot be overriding as they are local to class 
	 * 
	 */

	public static void main(String[] args) {
		ParentCar c1 = new ChildCar();
		c1.getNoOfCylinders(4);
		c1.getCarDetails(2);
		ParentCar.increaseSpeed();
		ChildCar.increaseSpeed();

	}
	
	public void getCarDetails(int i) {
		//super.getCarDetails();
		System.out.println("This is from Child Class");
	}

	public static void increaseSpeed() {
		System.out.println("Static Method from Child");
	}
}
