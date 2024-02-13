package spring.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {

	private String city="Shahjahanpur";
	private String state="UP";
	
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
