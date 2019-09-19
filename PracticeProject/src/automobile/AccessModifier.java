package automobile;

public class AccessModifier {

	public static void main(String[] args) {
		
		int Speed = 10;
		
		Cars C1 = new Cars(Speed);
		C1.Speed = 5;
		C1.setPrivateSpeed(10);
		C1.protectedSpeed = 100;
		C1.decreaseSpeed();

	}

}
