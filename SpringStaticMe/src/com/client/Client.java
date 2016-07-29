package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santosh.Car;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");
		Car c= (Car) ap.getBean("cf");
		c.drive();
		
	}

}
