package StaticPackage;

public class StaticExampleClass {
	
	private String make;
	private static int wheelCount = 4;
	private static int instanceNum = 0;
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}
	
	public static int getWheelCount() {
		return wheelCount;
	}

}
