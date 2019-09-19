package StaticPackage;

public class StaticDemo {

	public static void main(String[] args) {

		StaticExampleClass s1 = new StaticExampleClass("BMW");
		System.out.println("Make of the car is : " + s1.getMake());
		System.out.println("The Instance Number is : " + StaticExampleClass.getInstanceNum());
		System.out.println("The count of Wheel is : " + StaticExampleClass.getWheelCount());
		
		
		StaticExampleClass s2 = new StaticExampleClass("Benz");
		System.out.println("Make of the car is : " + s2.getMake());
		System.out.println("The Instance Number is : " + StaticExampleClass.getInstanceNum());
		System.out.println("The count of Wheel is : " + StaticExampleClass.getWheelCount());
		
	}

}
