package com.gofdp.behavioralpatterns.templatemethod.dishes;

public final class FancyFish2 implements IDish {

	@Override
	public String[] getIngredients() {
		//source http://www.jamieoliver.com/recipes/fish-recipes/bacalhau-br-s/#t8VdU0l9xyY3AlxA.97
		String[] ingredients = {
			"salt cod",
			"fresh flat-leaf parsley",
			"banana shallots",
			"lemon",
			"onions",
			"black pepper",
			"black olives",
			"green olives",
			"dried chilli flakes",
			"red wine vinegar",
			"extra virgin olive oil",
			"vegetable oil",
			"potatoes",
			"free-range eggs",
			"sea salt"
		};
		return ingredients;
	}

	@Override
	public int getCookingTime() {
		return 100;
	}

	@Override
	public int getDifficulty() {
		return 3;
	}
	
	@Override
	public String getName() {
		return "Bacalhau à Brás";
	}
}
