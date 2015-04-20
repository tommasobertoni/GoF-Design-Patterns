package com.gofdp.behavioralpatterns.templatemethod;

import com.gofdp.behavioralpatterns.templatemethod.dishes.FancyPasta1;
import com.gofdp.behavioralpatterns.templatemethod.dishes.IDish;

public class Cook extends StudentLevelCook {
	
	public Cook() {
		super();
		knownRecipes.add(new FancyPasta1());
	}

	@Override
	public String[] getPots() {
		String[] pots = {
			"pot",
			"pan",
			"bowl"
		};
		return pots;
	}

	@Override
	protected void prepareKitchen(IDish dish) {
		System.out.println("Move away objects, clean table");
	}

	@Override
	protected void prepareTools(IDish dish) {
		System.out.println("Take pots and organize their location");
	}

	@Override
	protected void describeCooking(IDish dish) {
		System.out.println("This dish takes " + dish.getCookingTime() + " minutes to cook, but it's worth it");
	}

	@Override
	protected void serve(IDish dish) {
		System.out.println("A tasty " + dish.getName());
	}
}
