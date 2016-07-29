package com.santosh;

public class Car {
	private String car, name, number;

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void printData() {
		System.out.println(car);
	}
}
