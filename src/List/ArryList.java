package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Working with ArrayList

public class ArryList {

	public static void main(String[] args) {
		

		/*
		 * 2 ways of creating a list
		 * 
		 */
		
		// creating an object
		
		ArrayList list2 = new ArrayList();
		
		// creating a polymorphic object.(prefered way)
		// List is a super class and ArrayList is a sub class
		
		List list1 = new ArrayList();//RAW Type, should not work with raw type
		list1.add(3);
		list1.add(7);
		list1.add("hello");
		list1.add(4.5);
		
		System.out.println(list1); //[3, 7, hello, 4.5] but its not a good practice. We cant sort it or perform any operations on it.
		
		// Preferred way is to mention the data type but we should keep in mind that in Collection classes we cant work with Primitive types 
		// we work with wrapper classes
		
		List <Integer> list = new ArrayList<>(); //Generic declaration/implementation of ArrayList
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(1);
		
		System.out.println(list); //[3, 7, 4, 1]
		
		/*
		 *  Addition and removal is elastic in ArrayList
		 */
	
		
		
		list.remove(0);
		System.out.println(list); //[7, 4, 1]
		
		list.add(0,1);
		System.out.println(list);// adding 1 on index 0 [1, 7, 4, 1]
		
		
		
		/* Sorting ArrayList */
		
		Collections.sort(list);// always sort in ASC order
		
		for (int i : list) { // we need wrapper class only in declaration we can use primitive while iterating
			
			System.out.print(i + " "); //1 1 4 7 
			
			
		}
		
		System.out.print("\n******************");
		
		/* Sorting Reverse (DESC) order */
		
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i + ",");//7,4,1,1,
			
		}
		
		/* Binary search */
		
		System.out.print("\n******************");
		
		Collections.sort(list); //sorting is mandatory for binary search [1, 1, 4, 7] 
		int index = Collections.binarySearch(list,1); //(list,1) list is the name of the ArrayList and 1 is what we are looking for
		System.out.println("\nFound at index "+ index);
		
		
		// binary search of something that is not present in the ArrayLIst -insertionpoint -1 = Ans
		
		index = Collections.binarySearch(list, 2);
		System.out.println(index);// -3
		
		
		/* Noteable Methods in ArrayList */
		// to get an index from an ArrayList
		
		// 1 1 4 7
		
		System.out.println(list.get(2)); //4
		
		
		// Searching for whats in the index
		
		if(list.contains(5))
			System.out.println("Present");
		else
			System.out.println("Not present");// Not present
		
		
		
		
		
		
		
		
	}
	

}


