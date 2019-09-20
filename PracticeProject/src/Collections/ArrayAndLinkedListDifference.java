package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListDifference {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> alist = new ArrayList<Integer>();
		
		runDuration(alist, "Array List");
		runDuration(list, "Linked List");
	}
	
	public static void runDuration(List<Integer> list, String listtype) {
		
		System.out.println("Begnning of the method for list type : " + listtype);
		
		long starttime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000 ; i++) {
			list.add(i);
		}
		
		int size = list.size();
		
		System.out.println("The Size is : " + size);
		
		long endtime = System.currentTimeMillis();
		
		long duration = endtime - starttime ; 
		
		System.out.println("Duration of the list " + listtype + " is : " + duration + " ms");
	}

}
