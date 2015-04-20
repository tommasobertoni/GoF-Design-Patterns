package com.gofdp.behavioralpatterns.templatemethod.dishes;

public final class Hamburger implements IDish {

	@Override
	public String[] getIngredients() {
		String[] ingredients = {
			"meat",
			"bread",
			"salad",
			"tomatoes",
			"sauces"
		}; 
		return ingredients;
	}

	@Override
	public int getCookingTime() {
		return 10;
	}

	@Override
	public int getDifficulty() {
		return 0;
	}
	
	@Override
	public String getName() {
		return "Classic hamburger";
	}
}
