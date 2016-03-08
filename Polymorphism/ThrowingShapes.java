package com.deanharrison.polymorphism;

/*
 * A class purely just to hold the main method to demonstrate using the previous shape classes.
 */
public class ThrowingShapes {

	public static void main(String[] args) {
		//Declaration, Assignment, Creation	
		Circle circ = new Circle(50);
		Rectangle rect = new Rectangle(20, 20);  
		
		displayArea(circ);
		displayArea(rect);
	}
	
	/*
	 * Creating one polymorphic method to display the area of all shapes instead of overloading.
	 * 
	 */
	private static void displayArea(Shape2D shape){
		/*
		 * This is just a sample of how we would make sure that the shape we're passed is a circle
		 * 
		 * Then casting it allows us to access the Circle specific methods again.
		 * 
		*if(shape instanceof Circle){
		*	((Circle)shape).getArea();
		*}
		*/
		System.out.println(shape.calcArea()+"m");
	}
	
	/*
	 * No longer need multiple versions of the method.
	 * This demonstrates the usefulness of polymorphism.
	 * 
	*private static void displayArea(Circle circ){
	*	System.out.println(circ.getArea());
	*}
	*private static void displayArea(Rectangle rect){
	*	System.out.println(rect.getArea());
	*}
	*private static void displayArea(Triangle tri){
	*	System.out.println(tri.getArea());
	*}
	*private static void displayArea(Octagon octo){
	*	System.out.println(octo.getArea());
	*}
	*/

}
