package com.deanharrison.inheritance;

public class Cat extends Animal{

	public Cat(String name){
		super(name, "meow");
	}
	
	@Override
	public void eat() {
		System.out.println(name + " gets comfy before eating some salmon.");
	}

}
