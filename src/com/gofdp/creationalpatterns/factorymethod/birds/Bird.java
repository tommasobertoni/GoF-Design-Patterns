package com.gofdp.creationalpatterns.factorymethod.birds;

import com.gofdp.creationalpatterns.factorymethod.Pet;

public class Bird implements Pet {

	@Override
	public void sound() {
		System.out.println("chirp");
	}
}
