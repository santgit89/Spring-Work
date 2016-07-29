package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set cricketers;
	private Map countryCapitals;
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setCountryCapitals(Map countryCapitals) {
		this.countryCapitals = countryCapitals;
	}
	
	public void printData(){
		System.out.println("Fruits");
		
		for(Object fru:fruits){
			System.out.println(fru);
		}
		
		System.out.println("Cricketers");
		
		for(Object cricketer:cricketers){
			System.out.println(cricketer);
		}
System.out.println("Country and Capitals");
		Set keys=countryCapitals.keySet();
		for(Object CandC:keys){
			System.out.println("Country "+CandC+" Capital "+countryCapitals.get(CandC));
		}
	}
	

}
