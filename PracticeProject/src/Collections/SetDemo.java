package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//Hashset - does not maintain the order of insertion 
		
		Set<String> set = new HashSet<String>();
		
		set.add("Honda");
		set.add("Audi");
		set.add("BMW");
		set.add("BMW");
		
		for (String car : set) {
			System.out.println("The car name from Hash Set is : " + car);
		}
		
		System.out.println("\n");
		
		// LinkedHashSet - maintain the order of insertion 
		
		Set<String> lset = new LinkedHashSet<String>();
		
		lset.add("Honda");
		lset.add("Audi");
		lset.add("BMW");
		
		for (String car : lset) {
			System.out.println("The car name from Linked Hash Set is : " + car);
		}
		
		System.out.println("\n");
		
		// Tree Set  - maintain the natural sorting order
		
		Set<String> tset = new TreeSet<String>();
		
		tset.add("Honda");
		tset.add("Audi");
		tset.add("BMW");
		
		for (String car : tset) {
			System.out.println("The car name from Tree Set is : " + car);
		}
		
		
		System.out.println("\n");
		
		List<String> list = new ArrayList<String>();
		
		list.add("Honda");
		list.add("Audi");
		list.add("BMW");
		list.add("BMW");
		
		for (String car : list) {
			System.out.println("The car name from Arrary List : " + car);
		}
		
	}

}
