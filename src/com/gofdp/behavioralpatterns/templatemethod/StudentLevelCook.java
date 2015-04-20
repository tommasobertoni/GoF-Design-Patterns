package com.gofdp.behavioralpatterns.templatemethod;

import com.gofdp.behavioralpatterns.templatemethod.dishes.FancySalad;
import com.gofdp.behavioralpatterns.templatemethod.dishes.Hamburger;
import com.gofdp.behavioralpatterns.templatemethod.dishes.IDish;

public class StudentLevelCook extends BasicCook {
	
	public StudentLevelCook() {
		super();
		knownRecipes.add(new FancySalad());
	}

	@Override
	protected void prepareTools(IDish dish) {
		if (dish instanceof Hamburger) super.prepareTools(dish);
		else System.out.println("Get a bowl");
	}

	@Override
	protected void describeCooking(IDish dish) {
		System.out.println("In " + dish.getCookingTime() + " minutes this is going to be ready");
	}

	@Override
	protected void serve(IDish dish) {
		System.out.println("This " + dish.getName() + " smells really good");
	}
}
