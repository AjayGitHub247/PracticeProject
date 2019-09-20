package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
	
	public static void main(String[] args) {
		
		// Maps - Stores data is key and value pair 
		
		// Keys are unique and values can be duplicate 
		
		// HashMap - Does not maintains order 
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(3, "BMW");
		hashmap.put(12, "Honda");
		hashmap.put(6, "Audi");
		hashmap.put(15, "Audi");
		hashmap.put(9, "Maruti");
		
		System.out.println("\n");
		System.out.println("1st Iteration");
		for(Map.Entry<Integer, String> entry: hashmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("The Key is : " + key + " and the value from Hash Map is : " + value);
		}
		
		System.out.println("2nd Iteration");
		for(Integer key : hashmap.keySet()) {
			String value = hashmap.get(key);
			System.out.println("The Key is : " + key + " and the value from Hash Map is : " + value);		
		}
		
		// Linked Hash Map - Maintains the order of insertion 
		
		Map<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
		
		linkedmap.put(3, "BMW");
		linkedmap.put(12, "Honda");
		linkedmap.put(6, "Audi");
		linkedmap.put(15, "Audi");
		linkedmap.put(9, "Maruti");
		
		System.out.println("3rd Iteration");
		for(Integer key : linkedmap.keySet()) {
			String value = linkedmap.get(key);
			System.out.println("The Key is : " + key + " and the value from Linked Hash Map is : " + value);		
		}
		
		// Tree Map - Maintains the natural sorting order 
		
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
		treemap.put(3, "BMW");
		treemap.put(12, "Honda");
		treemap.put(6, "Audi");
		treemap.put(15, "Audi");
		treemap.put(9, "Maruti");
		
		System.out.println("4th Iteration");
		for(Integer key : treemap.keySet()) {
			String value = treemap.get(key);
			System.out.println("The Key is : " + key + " and the value from Tree Map is : " + value);		
		}
	}

}
