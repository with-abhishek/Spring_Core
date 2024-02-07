package spring.model;

import lombok.Data;

@Data
public abstract class Employee3 {

	private String name;
	private int id;
	private Address address;

	public abstract Address applyAddress();
	
	public Employee3() {
		super();
	}

	public Employee3(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Employee3.Employee3()");
	}

	public Employee3(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		System.out.println("Employee3.Employee3()");
	}

}
