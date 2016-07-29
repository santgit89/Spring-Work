package com.santosh;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;

public class Test {
	private static String carName;

	public static void setCarName(String carName) {
		Test.carName = carName;
	}

	public static Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Car c=(Car)Class.forName(carName).newInstance();
		return c;

	}
}
