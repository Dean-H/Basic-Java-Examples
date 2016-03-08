package com.deanharrison.polymorphism;

/*
 * An abstract class to define the functionality that all 2DShapes will have
 */
public abstract class Shape2D {
	protected double area;
	protected String color;
	
	public void setColor(String newColor){
		this.color = newColor;
	}
	public String getColor(){
		return this.color;
	}
	public double getArea(){
		return this.calcArea();
	}
	/*
	 * An abstract method that will have to be implemented by any sub class
	 * 
	 * We do this because the calculations for area is different depending on the shape.
	 */
	protected abstract double calcArea();
}
