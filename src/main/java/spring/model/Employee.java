package spring.model;

import lombok.Data;

@Data
public class Employee {

	private String name;
	private int id ;
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(String name, int id ) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Employee.Employee()");
	}
	public Employee(String name, int id ,Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address=address;
		System.out.println("Employee.Employee()");
	}
	
	
}
