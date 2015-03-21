package com.gofdp.creationalpatterns.factorymethod.dogs;

import com.gofdp.creationalpatterns.factorymethod.Pet;

public class Dog implements Pet {

	@Override
	public void sound() {
		System.out.println("woof woof");
	}
}
