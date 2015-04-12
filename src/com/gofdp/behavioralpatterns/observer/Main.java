package com.gofdp.behavioralpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		
		SecondsCounter secondsCounter = new SecondsCounter();
		Clock clock = new Clock();
		UpdatesManager updatesManager = new UpdatesManager();
		
		secondsCounter.addObserver(clock);
		secondsCounter.addObserver(updatesManager);
		
		new TerminateProgramAfterCount(secondsCounter, 1000);
		
		secondsCounter.start();	
	}
	
	private static class TerminateProgramAfterCount implements Observer {
		
		private SecondsCounter _secondsCounter;
		private int _targetCount;
		
		public TerminateProgramAfterCount(SecondsCounter secondsCounter, int targetCount) {
			_secondsCounter = secondsCounter;
			_targetCount = targetCount;
			
			_secondsCounter.addObserver(this);	
		}

		@Override
		public void update(Observable o, Object arg) {
			if ((int)arg >= _targetCount) {
				System.out.println("End program!");
				_secondsCounter.stop();
			}
		}
	}
}
