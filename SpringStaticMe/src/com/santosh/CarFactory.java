package com.santosh;

public class CarFactory {
	
	private static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	public	static Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Car c=(Car) Class.forName(carName).newInstance();
		return c;
	}

}
