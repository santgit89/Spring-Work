package com.bean;

public class Car {
	private String[] carName;
	private Engine[] engine;
	public void setCarName(String[] carName) {
		this.carName = carName;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	public void printData(){
		System.out.println("carNames");
		for(String car:carName){
			System.out.println(car);
		}
		System.out.println("Engine");
		for(Engine year: engine){
			System.out.println(year.getModelYear());
		}
	}
}
