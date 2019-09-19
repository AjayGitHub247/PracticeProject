package automobile;

public class AbstractDemo extends AbstractCar {

	public AbstractDemo(int StartSpeed) {
		super(StartSpeed);
	}

	@Override
	public void setEngineType(String startType) {
		System.out.println("Engine Start Type: " + startType);		
	}
	
	

}
