package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp =  IOC.getBean("employee",Employee.class);
		
		System.out.println(emp);
	}

}
