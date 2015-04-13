package com.gofdp.behavioralpatterns.state;

import com.gofdp.behavioralpatterns.state.moods.*;

public class Person {

	private IMood _mood;
	private Computer _computer;
	private boolean _usingPc;
	
	public Person(Computer computer) {
		_computer = computer;
		_mood = new FineMood();
	}
	
	public void setHappy() {
		_mood = new HappyMood();
	}
	
	public void setNormal() {
		_mood = new FineMood();
	}
	
	public void useComputer(OnReallyAlteredMood oram) {
		if (_usingPc) return;
		_usingPc = true;
		
		boolean result = false;
		while (_usingPc) {
			
			if (!_computer.isTurnedOn()) result = _computer.turnOn();
			else if (_computer.isTurnedOn() && !result) result = _computer.turnOff();
			else result = _computer.use();
			
			if (result) System.out.println("Using computer: it works..");
			else if (!_mood.handle(result)) {
				
				System.out.println("Using computer: " + _mood.prefix() + " the computer doesn't work");
				switch (_mood.angryLevel()) {
				case -1:
				case 0:
					_mood = new BoredMood();
					break;
				
				case 1:
					_mood = new AnnoyedMood();
					break;
					
				case 2:
					_mood = new AngryMood();
					break;
					
				case 3:
					oram.turnOffAndCalmDown();
					break;
				}
			}
		}
		
		_computer.turnOff();
		System.out.println("I better go to sleep.");
	}
	
	@Override
	public String toString() {
		return String.format("How am I? %s", _mood.howAreYou());
	}
	
	public void stopUsingComputer() {
		_usingPc = false;
	}
	
	public abstract class OnReallyAlteredMood {
		
		public abstract void calmDown();
		
		private void turnOffAndCalmDown() {
			_usingPc = false;
			calmDown();
		}
	}
}
