/*
 * An abstract class that defines some basic functionality for an animal,
 * the class was made abstract because we did not want people creating an Animal object.
 * 
 * To use the functionality you would have to create either a Cat, Dog or Cow.
 * 
 * Eat was different for each animal so we defined that as an abstract method,
 * we then implemented each of the animals own versions.
 */

package com.deanharrison.inheritance;

public abstract class Animal {
	
	protected String name;
	protected String sound;
	
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	public abstract void eat();
	
	public void move(String direction, int distance){
		System.out.println(name + " moves " + direction + " for " + distance + "m.");
	}
	
	public void makeSounds(){
		System.out.println(name + " starts to " + sound + ".");
	}
	
}
