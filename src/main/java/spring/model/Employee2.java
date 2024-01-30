package spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Employee2 implements InitializingBean , DisposableBean {
	
	private String name;
	int age;
	int salary;
	@Autowired
	Address address;
	
	@Override
	public void destroy() throws Exception {
	System.out.println("Employee2.destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee2.afterPropertiesSet()");
	}
	
	private void xmlInitMethod() {
		System.out.println("Employee6.xmlInitMethod()");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("Employee6.xmlDestroyMethod()");
	}

}
