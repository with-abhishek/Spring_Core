package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Employee {

	private String name;
	private int id ;
	
//	@Autowired
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
	public Address getAddress()
	{
		return address;
	}
	@Autowired
	@Qualifier("address1") // --> used when the multiple bean of the class to search a bean 1 and it found more ,ambiguity problem
	public void setAddress(Address address)
	{
		this.address=address;
	}
	
	
	
	
	
	
}
