package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		// Adding items to list 
		
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Benz");
		cars.add("Audi");
		cars.add("Maruti");
		cars.add("Maruti");
		
		// Get the Size 
		
		int size = cars.size();
		System.out.println("The Size is : " + size);
		
		// Get element from the list 
		
		System.out.println("The item on the index 1 is : " + cars.get(1));

		// for loop to print items in the list 
		
		for (int i = 0; i<size ; i++) {
			System.out.println("The item in the list at " + i + " is : " + cars.get(i));
		}
		
		// Print with for each loop 
		System.out.println("\n");
		
		// how to remove 
		
		cars.remove(size - 1);
		
		for (String car : cars) {
			System.out.println("The car name is: " + car);
		}

	}

}
