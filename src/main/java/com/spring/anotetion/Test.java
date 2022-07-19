package com.spring.anotetion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/anotetion/contextanot.xml");
         Emp employee=context.getBean("emp1",Emp.class);
         
         System.out.println(employee.address.getPincode());
        		 
        		 
        		
	}

}
