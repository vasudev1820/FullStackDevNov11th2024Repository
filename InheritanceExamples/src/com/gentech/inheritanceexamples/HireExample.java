package com.gentech.inheritanceexamples;
class Animal
{
    void eat() 
    {
        System.out.println("this animal eats food.");
    }
}

class Dog extends Animal 
{  
    void DogSounds() 
    {
        System.out.println("Dog barks.");
    }

}

class Cats extends Animal
{
	void CatSounds()
	{
		System.out.println("cats meoww");
	}
}


public class HireExample
{

	public static void main(String[] args)
	{
		Cats obj=new Cats();
		obj.eat();
		obj.CatSounds();
		
		Dog obj1=new Dog();
		obj1.DogSounds();

		
	}

}
