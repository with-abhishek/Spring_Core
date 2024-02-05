package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Employee {

	private String name;
	private int id ;
	private Address address;
//	public Employee(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	
	public Employee(String name, int id,Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address=address;
	}
	
	
	
	
	
	
}
