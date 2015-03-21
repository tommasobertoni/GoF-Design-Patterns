package com.gofdp.creationalpatterns.factorymethod.birds;

import com.gofdp.creationalpatterns.factorymethod.Pet;
import com.gofdp.creationalpatterns.factorymethod.PetCreator;

public class BirdCreator extends PetCreator {

	@Override
	public Pet factoryMethod() {
		return new Bird();
	}
}
