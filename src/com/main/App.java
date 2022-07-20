package com.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.main.utility.A;

import Model.Employee;

public class App {

	public static void main(String[] args) {
		
		// creating employee objects
		
		Employee e1 = new Employee(1, "Hairy", 85000, "IT");
		Employee e2 = new Employee(2, "Ronald", 75000, "Admin");
		Employee e3 = new Employee(3, "Hermon", 95000, "SALES");
		Employee e4 = new Employee(4, "darco", 80000, "IT");
		
		// create a list and attach all thee employees to the list
		
		/* one way to do it

		 * List<Employee> list = new ArrayList<>(); 
		 * list.add(e1); list.add(e2);list.add(e3);list.add(e4);
		 * 
		 * Vector and LinkedList works the same way as Array List. If we use Vector instead of ArrayList our program would run fine.
		 * Implementation of all List classes is similar
		 * Vector is the older implmentation of ArrayList
		 * Vector is thread safe, ArrayList is not thread safe
		 * 
		 * 
		 * Array takes the null value
		 * ArrayList is the fastest implentation of List
		 * ArrayList takes the null value however, doing operations on null value gives NullPointerException
		 * All List accept duplicates
		 * 
		 * 
		 * LinkedList, elements are connected in the heap. It keeps track of the next element
		 * LinkedList must be used when we want to maintain Insertion
		 * LinkedList is slow for sorting and comparison operations
		 * 
		*/
		
		
		// preffered way
		
		
		List<Employee> list = Arrays.asList(new Employee[] {e2,e1,e4,e3});// return employee list
		for(Employee e : list) {
			System.out.println(e);// it will fetch the information from the employee class and return it according to toString()
			
		}
		
		System.out.println("**** After Sorting salaries in ASC order using Comparator method ****");
		
		/* Sort the list based on salary in ASC order */
		
		// cant use collections.sort(list) because we are not sorting in a natural way. TO use Collections.sort(list) we need to 
		// to give a comparison criteria to employee we can use two interfaces 'comparator' and 'comparable'
		// comparator: create a seperate arbitary class. I created it in main package with the name A
		
		
		// using comparator method
		// telling Collections.sort that we are using A
		A a = new A();
		Collections.sort(list,a);
		
			for(Employee e : list) {
				System.out.println(e);
		}
			
		// using comparabale method
		System.out.println("**** After Sorting ids' ASC order using Comparable method ****");
		
		//  compare it with ids
		//	using comparable method, we will implement we will implement Comaparable<Employee> in Employee class
			
		Collections.sort(list);
		
		for (Employee e : list) {
			System.out.println(e);
		}
		
		
		// to do it in DESC order we just need to swap this and e2 in Employee class 
		System.out.println("**** After Sorting ids' DSCE order using Comparable method ****");
		
		Collections.sort(list);
		
		for (Employee e : list) {
			System.out.println(e);
		}
		
		
		
		

	}

}
