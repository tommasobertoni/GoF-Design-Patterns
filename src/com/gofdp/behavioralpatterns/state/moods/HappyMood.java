package com.gofdp.behavioralpatterns.state.moods;

public class HappyMood extends IMood {

	@Override
	public int angryLevel() {
		return -1;
	}

	@Override
	public String howAreYou() {
		return "Really good, thanks :)";
	}

	@Override
	public String prefix() {
		return "Yay";
	}

	@Override
	protected int getLimitBadResults() {
		return 3;
	}
}
