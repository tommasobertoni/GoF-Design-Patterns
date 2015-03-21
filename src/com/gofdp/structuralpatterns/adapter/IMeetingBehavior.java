package com.gofdp.structuralpatterns.adapter;

public interface IMeetingBehavior {

	boolean shakeHandAndGreet(IMeetingBehavior imb);
	
	boolean replyToHandshake();
}
