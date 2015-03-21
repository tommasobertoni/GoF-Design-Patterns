package com.gofdp.creationalpatterns.factorymethod.cats;

import com.gofdp.creationalpatterns.factorymethod.Pet;
import com.gofdp.creationalpatterns.factorymethod.PetCreator;

public class CatCreator extends PetCreator {

	@Override
	public Pet factoryMethod() {
		return new Cat();
	}
}
