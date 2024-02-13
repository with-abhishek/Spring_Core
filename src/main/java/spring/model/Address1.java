package spring.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address1 implements IAddress {

	private String city="Manali";
	private String state="HP";
	
	
}
