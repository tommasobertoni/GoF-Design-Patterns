package com.gofdp.creationalpatterns.factorymethod;

import com.gofdp.creationalpatterns.factorymethod.birds.BirdCreator;
import com.gofdp.creationalpatterns.factorymethod.cats.CatCreator;
import com.gofdp.creationalpatterns.factorymethod.dogs.DogCreator;

public class Main {

	public static void main(String[] args) {
		
		PetCreator[] petCreators = new PetCreator[3];
		
		petCreators[0] = new DogCreator();
		petCreators[1] = new CatCreator();
		petCreators[2] = new BirdCreator();
		
		for (PetCreator pc : petCreators) {
			Pet pet = pc.factoryMethod();
			pet.sound();
		}
	}
}
