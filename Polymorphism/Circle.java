package com.deanharrison.polymorphism;

/*
 * A circle class which is a direct subclass of Shape2D
 */
public class Circle extends Shape2D{

	private int radius;
	private int diameter;
	
	public Circle(int newRadius){
		this.radius = newRadius;
		this.diameter = newRadius * 2; 
	}
	
	public int getRadius(){
		return this.radius;
	}
	public int getDiameter(){
		return this.diameter;
	}
	public void setRadius(int newRadius){
		this.radius = newRadius;
		this.diameter = newRadius * 2;
	}

	/*
	 * Adding in the functionality for calculating the area of a circle
	 * 
	 * (non-Javadoc)
	 * @see com.deanharrison.polymorphism.Shape2D#calcArea()
	 */
	@Override
	protected double calcArea() {
		return Math.PI * (radius * radius);
	}
	
}
