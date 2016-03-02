package com.deanharrison.inheritance;

public class Dog extends Animal{
	
	public Dog(String name){
		super(name, "bark");
	}

	@Override
	public void eat() {
		System.out.println(name + " runs to their bed and starts to chew on a bone.");
	}
}
