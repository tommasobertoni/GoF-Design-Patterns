package com.gofdp.behavioralpatterns.state.moods;

public class FineMood extends IMood {

	@Override
	public int angryLevel() {
		return 0;
	}

	@Override
	public String howAreYou() {
		return "Fine, thanks";
	}

	@Override
	public String prefix() {
		return "Ok";
	}

	@Override
	protected int getLimitBadResults() {
		return 2;
	}
}
