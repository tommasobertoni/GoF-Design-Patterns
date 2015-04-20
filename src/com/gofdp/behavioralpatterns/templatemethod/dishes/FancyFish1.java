package com.gofdp.behavioralpatterns.templatemethod.dishes;

public final class FancyFish1 implements IDish {

	@Override
	public String[] getIngredients() {
		//source http://www.health.com/health/recipe/0,,10000001949726,00.html
		String[] ingredients = {
			"salmon broken into pieces",
			"wheat berries",
			"whole-wheat breadcrumbs",
			"egg whites",
			"panko",
			"greek-style yogurt",
			"chopped fresh dill",
			"fresh lemon juice",
			"sliced cucumbers",
			"pickled ginger"
		};
		return ingredients;
	}

	@Override
	public int getCookingTime() {
		return 80;
	}

	@Override
	public int getDifficulty() {
		return 2;
	}
	
	@Override
	public String getName() {
		return "Salmon Cakes with Dill Sauce";
	}
}
