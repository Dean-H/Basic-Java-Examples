package com.deanharrison.classstructure;

public class Horse {
	
	private String name;
	private String breed;
	private char gender;
	private int topSpeed;
	private String dob;
	private int weight;
	
	/*
	 * With a constructor we can define the required information
	 * that is needed to create a Horse object.
	 * 
	 * by defining our own constructor the default is no longer added.
	 * public Horse(){super();}
	 */
	public Horse(String newName, String newBreed, char newGender, String newDOB){
		this.name = newName;
		this.breed = newBreed;
		this.gender = newGender;
		this.dob = newDOB;
	}
	
	/*
	 * Getters and setters for the state of the class.
	 */
	public void setWeight(int newWeight){
		if(newWeight > 0){
			this.weight = newWeight;
		}
	}
	public int getWeight(){
		return this.weight;
	}
	public void setTopSpeed(int newTopSpeed){
		this.topSpeed = newTopSpeed;
	}
	public int getTopSpeed(){
		return this.topSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public char getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}

	/**
	 * 
	 * @param distance represents distance in meters
	 * 
	 * A simple method to move the horse forward a specified number of meters.
	 */
	public void moveForward(int distance){
		System.out.println("The horse has moved "+ distance+"m.");
	}
		
}
