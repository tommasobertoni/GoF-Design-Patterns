package com.gofdp.behavioralpatterns.mediator;

public interface Mediator {
	
	public void addColleague(Colleague colleague);
	
	public void removeColleague(Colleague colleague);

	public void sendMessage(String message, Colleague author, int authorityLevel);
	
	public void sendMessage(String message, Colleague author, String receiverId);
	
	public Colleague getColleague(String id);
}
