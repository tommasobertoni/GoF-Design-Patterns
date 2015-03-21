package com.gofdp.behavioralpatterns.adapter;

public class Robot {

	protected String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean moveArmUp(int armIndex) {
		//move the arm
		return true;
	}
	
	public boolean moveArmDown(int armIndex) {
		//move the arm
		return true;
	}
	
	public boolean moveArmLeft(int armIndex) {
		//move the arm
		return true;
	}
	
	public boolean moveArmRight(int armIndex) {
		//move the arm
		return true;
	}
	
	public boolean aimNearestObject(int armIndex) {
		//aims the nearest object (hand)
		return true;
	}
	
	public boolean openHand(int armIndex) {
		//open the hand
		return true;
	}
	
	public boolean closeHand(int armIndex) {
		//close the hand
		return true;
	}
}
