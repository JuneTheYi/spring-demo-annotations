package com.annotations.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// close the container
		context.close();
	}
}
