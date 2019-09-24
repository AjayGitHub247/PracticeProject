package ThisDemo;

public class ThisKeyWord {
	
	int id;
	
	public ThisKeyWord(int id) {
		 this.display();
		 this.id = id;
	}
	
	void display() {
		System.out.println("The Value of ID :" + id);
	}
	
	public static void main(String[] args) {
		ThisKeyWord c1 = new ThisKeyWord(10);
		c1.display();	}

}
