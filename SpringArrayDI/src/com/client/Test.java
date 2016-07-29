package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Car;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Car cr=(Car)ap.getBean("c");
		cr.printData();
	}
}
