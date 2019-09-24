package AccessModifier;

public class Child extends Parent {
	
	void m2() {
		System.out.println("The Value of i : " + i);
		System.out.println("The Value of j : " + j);
		System.out.println("The Value of k : " + k);
		
		//Private data Member not accessible 
//		System.out.println("The Value of l : " + l);
	}
}
