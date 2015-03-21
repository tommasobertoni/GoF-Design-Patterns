package com.gofdp.behavioralpatterns.adapter;

public class RobotAdapterInheritance extends Robot implements IMeetingBehavior {

	public RobotAdapterInheritance(String name) {
		setId(name);
	}
	
	@Override
	public boolean shakeHandAndGreet(IMeetingBehavior imb) {
		
		greet();
		
		return handshake() && imb.replyToHandshake();
	}
	
	private void greet() {
		System.out.println("Hi, I'm " + getId() + " the robot");
	}
	
	private boolean handshake() {
		
		if (!moveArmUp(0) ||
			!moveArmRight(0) ||
			!openHand(0) ||
			!moveArmUp(0) ||
			!moveArmLeft(0) ||
			!aimNearestObject(0) ||
			!closeHand(0) ||
			!openHand(0) ||
			!moveArmRight(0) ||
			!moveArmDown(0) ||
			!moveArmDown(0) ||
			!moveArmLeft(0))
			return false;
		//handshake ends
		
		return true;
	}

	@Override
	public boolean replyToHandshake() {
		greet();
		return handshake();
	}
}
