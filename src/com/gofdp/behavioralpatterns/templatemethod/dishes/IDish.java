package com.gofdp.behavioralpatterns.templatemethod.dishes;

public interface IDish {

	public String[] getIngredients();
	
	public int getCookingTime();
	
	public int getDifficulty();
	
	public String getName();
}
