package com.gofdp.structuralpatterns.adapter;

public class Human implements IMeetingBehavior {
	
	protected String name;
	
	public Human(String name) {
		this.name = name;
	}

	@Override
	public boolean shakeHandAndGreet(IMeetingBehavior imb) {
		
		greet();
		
		return handshake() && imb.replyToHandshake();
	}
	
	private void greet() {
		System.out.println("Hi, I'm " + name);
	}
	
	private boolean handshake() {
		//algorithm for a handshake
		//I suppose you already know how to do that :)
		return true;
	}

	@Override
	public boolean replyToHandshake() {
		greet();
		return handshake();
	}
}
