package com.deanharrison.classstructure;

public class Stable {
	
	public static void main(String[] args){
		Horse myHorse = new Horse("Sea Biscuit", "Caspian", 'M', "02/03/2016");
		myHorse.moveForward(10);
		
		myHorse.setTopSpeed(100);
		
		myHorse.setWeight(50);
		System.out.println(myHorse.getWeight());
	}
}
