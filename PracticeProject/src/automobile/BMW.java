package automobile;

public class BMW extends Cars{
	
	public BMW(int StartSpeed) {
		super(StartSpeed);
	}

	@Override
	public void increaseSpeed() {
		this.Speed = Speed + 5;
		System.out.println("Increasing Speed for BMW : " + Speed);
	}

	@Override
	public void decreaseSpeed() {
		this.Speed = Speed - 2;
		this.protectedSpeed = 10;
		System.out.println("Decreasing Speed for BMW : " + Speed);
	}
	
	public void headupNavigation() {
		System.out.println("BMW Specific Functionality");
	}
	
	

}
