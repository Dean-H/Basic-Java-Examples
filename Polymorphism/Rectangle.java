package com.deanharrison.polymorphism;
/*
 * Rectangle class as a direct subclass of Shape2D
 */
public class Rectangle extends Shape2D{
	private int width;
	private int height;
	
	
	
	public Rectangle(int newHeight, int newWidth){
		this.width = newWidth;
		this.height = newHeight;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		this.width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}

	@Override
	protected double calcArea() {
		return width * height;
	}
	
	
}
