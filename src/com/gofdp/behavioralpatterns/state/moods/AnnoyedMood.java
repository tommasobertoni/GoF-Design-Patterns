package com.gofdp.behavioralpatterns.state.moods;

public class AnnoyedMood extends IMood {

	@Override
	public int angryLevel() {
		return 2;
	}

	@Override
	public String howAreYou() {
		return "I'm really bothered..";
	}

	@Override
	public String prefix() {
		return "What!?";
	}

	@Override
	protected int getLimitBadResults() {
		return 1;
	}
}
