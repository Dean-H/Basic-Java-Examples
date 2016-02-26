/**
	A simple Hello World class which is placed in a user-defined package.
	It then accesses another java file from a different package.
	
	To compile and run this example, create a java folder somewhere on your machine, place the "HelloWorldTwo.java" file into that java folder. Within the java folder create a sub-folder called classes.

	Once the sub-folder has been made compile using the following command: "java -d classes HelloWorldTwo.java"

	To run the file after it has been successfully compiled use the following command: "java -cp classes com.deanharrison.test.HelloWorldTwo.java"


	If you want to use the DBHandler class also, follow the directions in that file.
	
*/

package com.deanharrison.test;

//import com.deanharrison.database.DBHandler;

public class HelloWorldTwo{

	public static void main(String[] args){

		System.out.println("Spaghetti Sauce");

		//DBHandler db = new DBHandler();

	}
}
