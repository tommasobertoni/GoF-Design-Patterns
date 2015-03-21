package com.gofdp.creationalpatterns.factorymethod.cats;

import com.gofdp.creationalpatterns.factorymethod.Pet;

public class Cat implements Pet {

	@Override
	public void sound() {
		System.out.println("meow");
	}
}
