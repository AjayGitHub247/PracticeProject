package StaticPackage;

public class StaticKeyNoteDemo {
	
	static {
		System.out.println("Executing Static Block.");
	}
	
	public int addNum = 10;
	public static int staticAddNum = 10;
	public static void main(String[] args) {
		
		StaticKeyNoteDemo s1 = new StaticKeyNoteDemo();
		 
		int output = s1.sum(10);
		System.out.println("The Output is : " + output);
		
		int staticOutput = staticSum(20);
		System.out.println("The Output is : " + staticOutput);

	}
	
	public int sum(int num) {
		return addNum + num;
	}
	
	public static int staticSum(int num) {
		return staticAddNum + num;
	}

}
