package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.santosh.HelloWorld;

public class Client {
	public static void main(String[] args) {
		
		//finnd xml file
		Resource r=new ClassPathResource("resources/springbeanfactory.xml");
		
		//load xml into container
		BeanFactory bean=new XmlBeanFactory(r);
		
		/*Object o= bean.getBean("t");
		HelloWorld hw=(HelloWorld) o;*/
		HelloWorld hw=(HelloWorld)bean.getBean("t");
		hw.hello();
		hw.santosh(); 
		bean.getBean("t");
	}

}
