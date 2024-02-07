package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Address;
import spring.model.Employee3;

public class App_LookUp {

	public static void main(String[] args) {

		ApplicationContext IOC = new ClassPathXmlApplicationContext("lookup.xml");
		Employee3 e3 = IOC.getBean(Employee3.class);

		e3.setAddress(e3.applyAddress());
		Address ad1 = new Address();
		Address ad2 = new Address();
		System.out.println(ad1.hashCode());
		System.out.println(ad2.hashCode());
		System.out.println(e3);
		e3.getAddress().setCity("Delhi");
		System.out.println(e3);
		
		Employee3 e4 =IOC.getBean(Employee3.class);
		e4.setAddress(e4.applyAddress());
		e4.getAddress().setCity("Azamgarh");
		System.out.println(e4);
	}

}
