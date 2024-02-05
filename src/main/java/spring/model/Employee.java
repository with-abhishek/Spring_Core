package spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private String name;
	private int id ;
	private Address address;
	
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer,String> map;
	
	
	
	
}
