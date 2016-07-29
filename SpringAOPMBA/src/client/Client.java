package client;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogBefor;

public class Client {
	public static void main(String[] args) {
		//creating target
		Bank b=new Bank();
		//creating Advice
		LogBefor lb=new LogBefor();
		
		//add targte+advice to proxy
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lb);
	
		Bank proxy=(Bank) pfb.getObject();
		int amount=proxy.deposit(2000, "sbi123");
		System.out.println(amount);
	}

}
