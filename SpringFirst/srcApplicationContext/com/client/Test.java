package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojjo.Hello;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Hello h=(Hello) ap.getBean("x");
		h.hello("santosh");
		h.getId();
		System.out.println(h.getEmail());
	}

}
