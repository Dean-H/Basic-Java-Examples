package com.deanharrison.inheritance;

public class Cow extends Animal{

	public Cow(String name){
		super(name, "moo");
	}
	@Override
	public void eat() {
		System.out.println(name + " contemplates the meaning of life while chewing some grass.");
	}

}
