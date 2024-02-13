package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
public class Employee {

	private String name="Ajay";
	private int id =101;
	
	private IAddress address;
	
	public Employee(String name, int id, IAddress address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public IAddress getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address1")
	public void setAddress(IAddress address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
}
