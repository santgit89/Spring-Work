package com.santosh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String carName;
	@Autowired
	@Qualifier(value = "e")
	private Engine[] engine;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void printData() {
		System.out.println("Engine Model years");
		for (Engine engin : engine) {
			System.out.println(engin.getModelYear());

		}

	}

}
