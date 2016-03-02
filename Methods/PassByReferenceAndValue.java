/*
 * This class was made purely just to demonstrate the difference between 
 * passing objects and primitives to methods.
 * 
 * Objects are passed by reference
 * Primitives are passed by value
 * 
 * Two methods defined, one to take the primitive (int) the other to take the Object (StringBuilder)
 * The class then outputs both examples before and after they have been altered.
 */

package com.deanharrison.classstructure.methods;

public class PassByReferenceAndValue {

	public static void main(String[] args) {
		int myInt = 100;			//Declaring myInt
		
		System.out.println(myInt);	//Print myInt before passing
		myPrimitiveMethod(myInt);	//Passing
		System.out.println(myInt);	//Print myInt after passing
		
		
		StringBuilder myStringBuilder = new StringBuilder("Hello");	//Declaring myStringBuilder
		
		System.out.println(myStringBuilder);	//Print myStringBuilder before passing
		myObjectMethod(myStringBuilder);		//Passing myStringBuilder
		System.out.println(myStringBuilder);	//Print myStringBuilder after passing
	}
	
	/*
	 * This method takes a primitive as a parameter and then alters it.
	 */
	public static void myPrimitiveMethod(int i){
		i += 100;
	}
	/*
	 * This method takes an Object as a parameter and then alters it.
	 */
	public static void myObjectMethod(StringBuilder sb){
		sb.append(" World");
	}
}
