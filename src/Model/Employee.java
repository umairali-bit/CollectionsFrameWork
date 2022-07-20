package Model;

public class Employee implements Comparable<Employee>{
	
	// declaration of instance variables
	
	private int id;
	private String name;
	private  double salary;
	private String department;
	
	
	// Blank constructor
	
	public Employee() {
		super();
	}

	// Constructor with feilds
	
	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	/* Getters and Setters */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	//toString()
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	//e1.compareTo(e2). "this' will represent e1 which is called to use the method e2

	@Override
	public int compareTo(Employee e2) {
		if (this.getId() < e2.getId())
			return -1;
		if (this.getId() > e2.getId())
			return 1;//swap
		if (this.getId() == e2.getId())
			return 0;
		
		return 0;
		
	}
	

	
	
	

}
