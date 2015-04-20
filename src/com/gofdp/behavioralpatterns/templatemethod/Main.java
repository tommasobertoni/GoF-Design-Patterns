package com.gofdp.behavioralpatterns.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		AbstractCook[] cooks = {
			new BasicCook(),
			new StudentLevelCook(),
			new Cook(),
			new MasterChef()
		};
		
		System.out.println("Chef's fantasy\n-----------");
		for (AbstractCook cook : cooks) {
			String completeCookName = cook.getClass().getName();
			System.out.println("Cook: " +
					completeCookName.substring(completeCookName.lastIndexOf(".") + 1, completeCookName.length()));
			cook.cook();
			System.out.println();
		}
		
		System.out.println("Dish number: 3\n-----------");
		for (AbstractCook cook : cooks) {
			try {
				String completeCookName = cook.getClass().getName();
				System.out.println("Cook: " +
						completeCookName.substring(completeCookName.lastIndexOf(".") + 1, completeCookName.length()));
				cook.cook(2);
			} catch (NoRecipeFoundException nRFEx) {
				System.out.println("I don't know how to cook that dish");
			}
			System.out.println();
		}
	}
}
