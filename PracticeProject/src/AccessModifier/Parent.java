package AccessModifier;

public class Parent {
	 
	int i = 10;
	
	public int j = 20;
	
	protected int k = 30;
	
	private int l = 40;
	
	void m1() {
		System.out.println("The Value of i : " + i);
		System.out.println("The Value of j : " + j);
		System.out.println("The Value of k : " + k);
		System.out.println("The Value of l : " + l);
	}

}
