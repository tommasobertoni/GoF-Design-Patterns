package com.gofdp.behavioralpatterns.mediator;

public class Main {

	public static void main(String[] args) {
		
		Mediator m = new ConcreteMediator();
		
		int[] authLevels = {0, 1, 1, 1, 3, 3, 4};
		for (int i = 0; i < authLevels.length; i++)
			new Colleague("c" + (i+1), authLevels[i], m);
		
		m.getColleague("c2").sendMessage("Hi level one!");
		m.getColleague("c5").sendMessage("Yo level 3!");
		m.getColleague("c6").sendMessage("Hello next level!", 4);
		m.getColleague("c7").sendMessage("Hello c6", "c6");
		
		m.getColleague("c3").sendBroadcastMessage("I leave..");
		m.removeColleague(m.getColleague("c3"));
		m.getColleague("c1").sendBroadcastMessage("Ok, bye c3!");
	}
}
