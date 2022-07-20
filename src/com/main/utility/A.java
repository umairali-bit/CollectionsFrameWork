package com.main.utility;

import java.util.Comparator;

import Model.Employee;

public class A implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// sorting by ASC salary
		
		// e1.salary < e2.salary : [e1,e2]: -1
		// e1.salary > e2.salary : [e2,e1]: swap : 1
		// e1.salary == e2.salary : [e1,e2]: 0
		
		if (e1.getSalary() < e2.getSalary())
			return -1;
		if (e1.getSalary() > e2.getSalary())
			return 1;//swap
		if (e1.getSalary() == e2.getSalary())
			return 0;
		
		return 0;
	}

}
