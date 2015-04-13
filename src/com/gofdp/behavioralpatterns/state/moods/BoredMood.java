package com.gofdp.behavioralpatterns.state.moods;

public class BoredMood extends IMood {

	@Override
	public int angryLevel() {
		return 1;
	}

	@Override
	public String howAreYou() {
		return "I'm bored..";
	}

	@Override
	public String prefix() {
		return "Uff";
	}

	@Override
	protected int getLimitBadResults() {
		return 2;
	}
}
