package spring.model;

import lombok.Data;

@Data
public class Address {

	private String city;
	private String state;
	
	public Address()
	{
		super();
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
}
