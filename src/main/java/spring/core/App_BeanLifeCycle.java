package spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Employee2;
public class App_BeanLifeCycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("BeanLifeCycle.xml"); 
    	Employee2 obj =  factory.getBean("empA",Employee2.class);
		System.out.println(obj);
		
		Employee2 obj1 =  factory.getBean(Employee2.class);
		System.out.println(obj1);
		
		factory.registerShutdownHook();
	}

}
