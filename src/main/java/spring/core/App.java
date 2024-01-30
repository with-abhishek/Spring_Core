package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1 =  (Employee)IOC.getBean("Kunal");
//		Employee e2 =  IOC.getBean(Employee.class);
		
		System.out.println(e1);
//		System.out.println(e2);
	}

}
