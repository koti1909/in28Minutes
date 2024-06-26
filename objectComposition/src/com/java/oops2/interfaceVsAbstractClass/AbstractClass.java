package com.java.oops2.interfaceVsAbstractClass;

abstract class Animal{
	abstract void bark();
}
class Dog extends Animal{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
	}
	
}

class Cat extends Animal{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
	}
	
}

public class AbstractClass {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Cat() , new Dog()};
		
		for(Animal object: animals) {
			object.bark();
		}

	}

}
