package com.gofdp.behavioralpatterns.state;

import java.util.Random;

public class Computer {
	
	private Random _rand = new Random(11);
	private boolean _isTurnedOn;

	public boolean turnOn() {
		_isTurnedOn = _rand.nextBoolean();
		return _isTurnedOn;
	}
	
	public boolean turnOff() {
		_isTurnedOn = false;
		return _isTurnedOn;
	}
	
	public boolean use() {
		return _rand.nextBoolean();
	}
	
	public boolean isTurnedOn() {
		return _isTurnedOn;
	}
}
