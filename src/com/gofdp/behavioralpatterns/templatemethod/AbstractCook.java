package com.gofdp.behavioralpatterns.templatemethod;

import java.util.ArrayList;
import java.util.List;

import com.gofdp.behavioralpatterns.templatemethod.dishes.Hamburger;
import com.gofdp.behavioralpatterns.templatemethod.dishes.IDish;

public abstract class AbstractCook {
	
	protected List<IDish> knownRecipes;
	
	public AbstractCook() {
		knownRecipes = new ArrayList<>();
		knownRecipes.add(new Hamburger());
	}

	public IDish[] getRecipes() {
		return knownRecipes.toArray(new IDish[knownRecipes.size()]);
	}
	
	public abstract String[] getPots();
	
	protected abstract void prepareKitchen(IDish dish);
	
	protected abstract void prepareTools(IDish dish);
	
	protected abstract void describeCooking(IDish dish);
	
	protected abstract void serve(IDish dish);
	
	public void cook() {
		try { cook(new java.util.Random(3).nextInt(getRecipes().length));
		} catch (NoRecipeFoundException nRFEx) {}
	}
	
	public void cook(int dishIndex) throws NoRecipeFoundException {
		IDish[] recipes = getRecipes();
		
		if (recipes.length == 0 ||
			dishIndex >= recipes.length ||
			dishIndex < 0) throw new NoRecipeFoundException();
		
		IDish dish = recipes[dishIndex];
		prepareKitchen(dish);
		prepareTools(dish);
		
		String[] ingredients = dish.getIngredients();
		String ingredientsString = "Ingredients: " + ingredients[0];
		for (String ingredient : ingredients)
			ingredientsString += ", " + ingredient;
		System.out.println(ingredientsString);
			
		describeCooking(dish);
		serve(dish);
	}
}

@SuppressWarnings("serial")
class NoRecipeFoundException extends Exception {}
