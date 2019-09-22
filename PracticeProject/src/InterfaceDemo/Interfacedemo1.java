package InterfaceDemo;

public class Interfacedemo1 implements Interface1{
	
	public void m1() {
		System.out.println("Child Class Method 1.");
		System.out.println("The Value of i is : " + Interface1.i);
	}
	
	public void m2() {
		System.out.println("Child Class Method 2.");
	}
	
	public static void main(String[] args) {
			Interfacedemo1 i1 = new Interfacedemo1();
			i1.m1();
			i1.m2();
		}

	

}
