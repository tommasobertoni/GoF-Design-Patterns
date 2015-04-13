package com.gofdp.behavioralpatterns.state.moods;

public class AngryMood extends IMood {

	@Override
	public int angryLevel() {
		return 3;
	}

	@Override
	public String howAreYou() {
		return "Damn angry!";
	}

	@Override
	public String prefix() {
		return "I HATE YOU";
	}

	@Override
	protected int getLimitBadResults() {
		return 0;
	}
}
