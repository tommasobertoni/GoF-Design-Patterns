package com.gofdp.behavioralpatterns.templatemethod.dishes;

public final class FancySalad implements IDish {

	@Override
	public String[] getIngredients() {
		//source http://recipes.familyeducation.com/salads/bread-salad-with-gorgonzola/68754.html
		String[] ingredients = {
			"salad",
			"creamy bleu cheese",
			"crisp ciabatta bread",
			"tomatoes",
			"basil"
		};
		return ingredients;
	}

	@Override
	public int getCookingTime() {
		return 15;
	}

	@Override
	public int getDifficulty() {
		return 1;
	}
	
	@Override
	public String getName() {
		return "Bread Salad with Gorgonzola";
	}
}
