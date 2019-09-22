package AbstractDemo;

public class carsDemo extends cars {

	@Override
	public void BMW() {
		System.out.println("This is BMW Method");
	}

	@Override
	public void Audi() {
		System.out.println("This is Audi Method");	
	}
	
	public static void main(String[] args) {
		cars c1 = new carsDemo();
		c1.numberOfWheelsInCar();
		c1.headsUpNavigation();
		c1.Audi();
		c1.BMW();
	}
	
	
}
