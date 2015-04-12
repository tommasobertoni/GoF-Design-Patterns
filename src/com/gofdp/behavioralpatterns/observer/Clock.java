package com.gofdp.behavioralpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Clock implements Observer {
	
	private final static int PRINT_EVERY_N_SECONDS = 30;
	
	private int _hours;
	private int _minutes;
	private int _seconds;
	private int _counter = PRINT_EVERY_N_SECONDS;

	@Override
	public void update(Observable o, Object arg) {
		
		int secondsCounted = (Integer) arg;
		
		_hours = secondsCounted / 3600;
		secondsCounted = secondsCounted % 3600;
		_minutes = secondsCounted / 60;
		secondsCounted = secondsCounted % 60;
		_seconds = secondsCounted;
		
		if (--_counter <= 0) {
			System.out.println(this);
			_counter = PRINT_EVERY_N_SECONDS;
		}
	}
	
	public int getHours() {
		return _hours;
	}
	
	public int getMinutes() {
		return _minutes;
	}
	
	public int getSeconds() {
		return _seconds;
	}
	
	@Override
	public String toString() {
		return String.format("Time %d:%d:%d", _hours, _minutes, _seconds);
	}
}
