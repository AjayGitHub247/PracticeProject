package SuperKeyword;

public class Child extends Parent {
	
	int i = 20;
	
	// Child class constructor first line is super()
	
	public Child() {
		super();
		System.out.println("Child Class Constructor");
		super.Display();
	}
	
	void m1() {
		System.out.println(i);
		System.out.println(super.i);
	}

}
