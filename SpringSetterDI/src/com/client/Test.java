package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;

public class Test {
	public static void main(String[] args) {

		String files[] = new String[] { "resources/car.xml", "resources/engine.xml" };
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);

		Car ce=(Car) ap.getBean("c");
		ce.printCarData();
		
	}
}
