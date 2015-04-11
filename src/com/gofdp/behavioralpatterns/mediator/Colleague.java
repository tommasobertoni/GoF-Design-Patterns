package com.gofdp.behavioralpatterns.mediator;

public class Colleague {

	private Mediator _mediator;
	private String _id;
	private int _authorityLevel;
	
	public Colleague(String id, int authorityLevel, Mediator mediator) {
		_id = id;
		_authorityLevel = authorityLevel;
		_mediator = mediator;
		
		mediator.addColleague(this);
	}
	
	public void sendBroadcastMessage(String message) {
		sendMessage(message, -1);
	}
	
	public void sendMessage(String message) {
		sendMessage(message, _authorityLevel);
	}
	
	public void sendMessage(String message, int authLevel) {
		_mediator.sendMessage(message, this, authLevel);
	}
	
	public void sendMessage(String message, String receiverId) {
		_mediator.sendMessage(message, this, receiverId);
	}
	
	void receiveMessage(String message, Colleague author) {
		System.out.println(String.format("(%s) message from %s: %s", _id, author._id, message));
	}
	
	public String getId() {
		return _id;
	}
	
	public int getAuthorityLevel() {
		return _authorityLevel;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Colleague))
			return false;
		
		Colleague colleague = (Colleague) obj;
		
		return colleague._id.equals(_id) && colleague._authorityLevel == _authorityLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s(lv %d)", _id, _authorityLevel);
	}
}
