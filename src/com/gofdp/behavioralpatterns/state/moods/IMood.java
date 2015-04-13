package com.gofdp.behavioralpatterns.state.moods;

public abstract class IMood {
	
	private int _badResultsCounter = 0;
	
	public boolean handle(boolean result) {
		if (!result && ++_badResultsCounter > getLimitBadResults()) {
			_badResultsCounter = 0;
			return false;
		}
		
		return false;
	}
	
	protected abstract int getLimitBadResults();
	
	public abstract int angryLevel();

	public abstract String howAreYou();
	
	public abstract String prefix();
}
