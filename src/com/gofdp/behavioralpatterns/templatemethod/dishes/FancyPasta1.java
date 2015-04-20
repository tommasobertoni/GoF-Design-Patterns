package com.gofdp.behavioralpatterns.templatemethod.dishes;

public final class FancyPasta1 implements IDish {

	@Override
	public String[] getIngredients() {
		//source http://www.myrecipes.com/recipe/pasta-with-asparagus-pancetta-pine-nuts
		String[] ingredients = {
			"pasta",
			"asparagus",
			"garlic",
			"pine nuts",
			"pancetta",
			"lemon juice",
			"olive oil",
			"salt and black pepper",
			"Parmigiano-Reggiano cheese"
		};
		return ingredients;
	}

	@Override
	public int getCookingTime() {
		return 40;
	}

	@Override
	public int getDifficulty() {
		return 1;
	}
	
	@Override
	public String getName() {
		return "Pasta with Asparagus, Pancetta, and Pine Nuts";
	}
}
