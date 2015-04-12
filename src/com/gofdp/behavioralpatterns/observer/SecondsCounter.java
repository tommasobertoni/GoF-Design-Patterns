package com.gofdp.behavioralpatterns.observer;

import java.util.Observable;

public class SecondsCounter extends Observable {
	
	private final static int MILLIS_TO_SLEEP = 10;

	private Thread _thread;
	private int _secondsCounter;
	private boolean _isRunning;
	
	public void start() {
		if (!_isRunning)
			initNewThread().start();
	}
	
	public void stop() {
		_isRunning = false;
	}
	
	public Thread initNewThread() {
		_isRunning = true;
		_thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (SecondsCounter.this._isRunning) {
					try {
						Thread.sleep(MILLIS_TO_SLEEP);
						_secondsCounter++;
						setChanged();
						notifyObservers(_secondsCounter);
					} catch (InterruptedException iE) {}
				}
			}
		});
		
		return _thread;
	}
}
