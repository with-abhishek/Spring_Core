package spring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
//@Primary
public class Address2 implements IAddress{
	private String city = "Rishikesh";
	private String state = "UK";

}
