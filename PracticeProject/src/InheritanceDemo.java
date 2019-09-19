import automobile.BMW;
import automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {

		int speed = 5;
		
		Cars C1 = new Cars(speed);
		
		C1.increaseSpeed();
		C1.publicSpeed = 10;
		
		BMW bmw1 = new BMW(speed);
		
		bmw1.increaseSpeed();
		bmw1.decreaseSpeed();
		bmw1.headupNavigation();
	}

}
