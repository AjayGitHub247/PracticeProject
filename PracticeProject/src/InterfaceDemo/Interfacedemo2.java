package InterfaceDemo;

public class Interfacedemo2 implements Interface1, Interface2 {
	
	public void m1( ) {
		System.out.println("Child Class Method 1");
		System.out.println("Value i from interface 1 : " + Interface1.i);
		System.out.println("Value i from interface 2 : " + Interface2.i);
	}
	
	public void m2() {
		 System.out.println("Child Class Method 2");
	}


	public static void main(String[] args) {
		
		Interfacedemo2 newinter = new Interfacedemo2();
		newinter.m1();
		newinter.m2();
		
	}

	
}
