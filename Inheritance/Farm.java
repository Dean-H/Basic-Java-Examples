/*
 * The farm class was made purely just to create some animals and execute some commands on them.
 * 
 */

package com.deanharrison.inheritance;

public class Farm {
	
	public static void main(String[] args){
		Dog myDog = new Dog("Prince");
		Cat myCat = new Cat("Pixie");
		Cow myCow = new Cow("Betsy");
		
		myDog.eat();
		myCat.eat();
		myCow.eat();
		
		System.out.println();
		
		myDog.makeSounds();
		myCat.makeSounds();
		myCow.makeSounds();
		
		System.out.println();
		
		myDog.move("left", 50);
		myCow.move("right", 10);
		myCat.move("back", 100);
		
		
//		makeAnimalEat(myDog);
//		makeAnimalEat(myCat);
//		makeAnimalEat(myCow);
//		
//		makeAnimalMakeSound(myDog);
//		makeAnimalMakeSound(myCat);
//		makeAnimalMakeSound(myCow);
		
		
	}
	
	/*
	 * The below methods are just to demonstrate how to generalise our code.
	 */
	public static void makeAnimalEat(Animal animal){
		animal.eat();
	}
	public static void makeAnimalMove(Animal animal, String direction, int distance){
		animal.move(direction, distance);
	}
	public static void makeAnimalMakeSound(Animal animal){
		animal.makeSounds();
	}
	
	
}
