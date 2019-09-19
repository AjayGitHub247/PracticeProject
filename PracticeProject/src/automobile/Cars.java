package automobile;

public class Cars {
	
	// Any where is the same package 
	int Speed;
	//Only in the same Class
	private int privateSpeed;
	// Any where in the Java World by importing the package and class 
	public int publicSpeed;
	// Any where in the same package and Sub Classes 
	protected int protectedSpeed;
	
	public Cars(int StartSpeed) {
		Speed=StartSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed) {
		privateSpeed = pSpeed;
		System.out.println("Private Speed: " + privateSpeed);
	}
	
	public void increaseSpeed() {
		Speed++;
		System.out.println("Increasing Speed of Cars: " + Speed);
	}
	
	protected void decreaseSpeed() {
		Speed--;
		System.out.println("Decreasing Speed of Cars: " + Speed);
	}

}
