package automobile;

public abstract class AbstractCar {
	
		int Speed;
	
		private int privateSpeed;
		  
		public int publicSpeed;

		public AbstractCar(int StartSpeed) {
			Speed=StartSpeed;
		}
		
		public void setPrivateSpeed(int pSpeed) {
			privateSpeed = pSpeed;
			System.out.println("Private Speed: " + privateSpeed);
		}
		
		public abstract void setEngineType(String startType);
}
