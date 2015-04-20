package com.gofdp.behavioralpatterns.templatemethod;

import com.gofdp.behavioralpatterns.templatemethod.dishes.IDish;

public class BasicCook extends AbstractCook {

	@Override
	public String[] getPots() {
		String[] pots = {
			"pan"
		};
		return pots;
	}

	@Override
	protected void prepareKitchen(IDish dish) {
		System.out.println("Move objects away from table");
	}

	@Override
	protected void prepareTools(IDish dish) {
		System.out.println("Take a pan");
	}

	@Override
	protected void describeCooking(IDish dish) {
		System.out.println("Always the same, always good: ready in " + dish.getCookingTime() + " minutes");
	}

	@Override
	protected void serve(IDish dish) {
		System.out.println("There's the dish: " + dish.getName());
	}
}
