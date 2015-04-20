package com.gofdp.behavioralpatterns.templatemethod;

import com.gofdp.behavioralpatterns.templatemethod.dishes.FancyFish1;
import com.gofdp.behavioralpatterns.templatemethod.dishes.FancyFish2;
import com.gofdp.behavioralpatterns.templatemethod.dishes.IDish;

public class MasterChef extends Cook {
	
	public MasterChef() {
		super();
		knownRecipes.add(new FancyFish1());
		knownRecipes.add(new FancyFish2());
	}

	@Override
	public String[] getPots() {
		String[] cookPots = super.getPots();
		String[] pots = new String[cookPots.length + 1];
		System.arraycopy(cookPots, 0, pots, 0, cookPots.length);
		pots[pots.length - 1] = "wok";
		return pots;
	}

	@Override
	protected void prepareKitchen(IDish dish) {
		System.out.println("Move away objects, clean table, turn on kitchen ventilation, turn on lights");
	}

	@Override
	protected void describeCooking(IDish dish) {
		System.out.println("Cooking time: " + dish.getCookingTime() + ", difficulty: " + dish.getDifficulty() + ", taste: delicious");
	}
}
