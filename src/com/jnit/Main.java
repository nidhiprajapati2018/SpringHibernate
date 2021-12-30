package com.jnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		
			SpringSelect x = (SpringSelect)appContext.getBean("hibernateobj");
			Student bob= new Student();
			bob.setSid(104);
			bob.setSname("bob");
			bob.setMarks(456);
			
			x.saveStudent(bob);

	}

}
