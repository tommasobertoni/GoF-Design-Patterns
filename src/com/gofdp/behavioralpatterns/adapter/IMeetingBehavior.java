package com.gofdp.behavioralpatterns.adapter;

public interface IMeetingBehavior {

	boolean shakeHandAndGreet(IMeetingBehavior imb);
	
	boolean replyToHandshake();
}
