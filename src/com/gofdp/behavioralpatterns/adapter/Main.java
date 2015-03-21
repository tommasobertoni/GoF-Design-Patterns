package com.gofdp.behavioralpatterns.adapter;

public class Main {

	public static void main(String[] args) {
		
		IMeetingBehavior imb1 = new Human("Smith Jerome");
		IMeetingBehavior imb2 = new RobotAdapterContainer("Bob");
		IMeetingBehavior imb3 = new RobotAdapterInheritance("James");
		
		System.out.println("Meeting success: " + imb1.shakeHandAndGreet(imb2) + "\n");
		System.out.println("Meeting success: " + imb2.shakeHandAndGreet(imb3) + "\n");
		System.out.println("Meeting success: " + imb3.shakeHandAndGreet(imb1) + "\n");
	}
}
