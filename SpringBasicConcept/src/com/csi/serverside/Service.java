package com.csi.serverside;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1 = (Employee)context.getBean("emp");
		e1.setEmpName("JERRY");
		System.out.println("\n Employee Name: "+ e1.getEmpName());
		
		context.registerShutdownHook();
	}

}
