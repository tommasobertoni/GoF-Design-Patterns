package com.gofdp.behavioralpatterns.adapter;

public class RobotAdapterContainer implements IMeetingBehavior {

	private Robot _robot;
	
	public RobotAdapterContainer(String name) {
		_robot = new Robot();
		_robot.setId(name);
	}

	@Override
	public boolean shakeHandAndGreet(IMeetingBehavior imb) {
		
		greet();
		
		return handshake() && imb.replyToHandshake();
	}
	
	private void greet() {
		System.out.println("Hello, my name is " + _robot.getId());
	}
	
	private boolean handshake() {
		
		if (!_robot.moveArmUp(0)) return false;
		
		if (!_robot.moveArmRight(0)) return false;
		
		if (!_robot.openHand(0)) return false;
		
		if (!_robot.moveArmUp(0)) return false;
		
		if (!_robot.moveArmLeft(0)) return false;
		
		if (!_robot.aimNearestObject(0)) return false;
		
		if (!_robot.closeHand(0)) return false;
		
		if (!_robot.openHand(0)) return false;
		
		if (!_robot.moveArmRight(0)) return false;
		
		if (!_robot.moveArmDown(0)) return false;
		
		if (!_robot.moveArmDown(0)) return false;
		
		if (!_robot.moveArmLeft(0)) return false;
		
		return true;
	}

	@Override
	public boolean replyToHandshake() {
		greet();
		return handshake();
	}
}
