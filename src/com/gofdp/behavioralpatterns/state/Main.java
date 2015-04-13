package com.gofdp.behavioralpatterns.state;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Person person = new Person(computer);
		//person.setHappy();
		
		System.out.println("Initial state: " + person);
		person.useComputer(person.new OnReallyAlteredMood() {
			@Override
			public void calmDown() {
				System.out.println("Final state: " + person);
			}
		});
	}
}
