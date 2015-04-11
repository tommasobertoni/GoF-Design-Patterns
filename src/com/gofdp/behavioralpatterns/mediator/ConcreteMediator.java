package com.gofdp.behavioralpatterns.mediator;

import java.util.LinkedList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	
	private List<Colleague> _colleagues;
	
	public ConcreteMediator() {
		_colleagues = new LinkedList<>();
	}
	
	@Override
	public Colleague getColleague(String id) {
		
		for (Colleague colleague : _colleagues)
			if (colleague.getId().equals(id))
				return colleague;
		
		return null;
	}

	@Override
	public void addColleague(Colleague colleague) {
		_colleagues.add(colleague);
	}

	@Override
	public void removeColleague(Colleague colleague) {
		_colleagues.remove(colleague);
	}

	@Override
	public void sendMessage(String message, Colleague author, int authorityLevel) {
		
		//authorityLevel < 0 -> broadcast
		for (Colleague colleague : _colleagues) {
			if (colleague != author)
				if (authorityLevel < 0 || colleague.getAuthorityLevel() == authorityLevel)
					colleague.receiveMessage(message, author);
		}
	}

	@Override
	public void sendMessage(String message, Colleague author, String receiverId) {
		
		if (receiverId.equals(author.getId())) return;
		
		Colleague colleague = getColleague(receiverId);
		if (colleague != null)
			colleague.receiveMessage(message, author);
	}
}
