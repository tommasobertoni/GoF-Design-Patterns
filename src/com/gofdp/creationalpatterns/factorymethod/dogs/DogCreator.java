package com.gofdp.creationalpatterns.factorymethod.dogs;

import com.gofdp.creationalpatterns.factorymethod.Pet;
import com.gofdp.creationalpatterns.factorymethod.PetCreator;

public class DogCreator extends PetCreator {

	@Override
	public Pet factoryMethod() {
		return new Dog();
	}
}
