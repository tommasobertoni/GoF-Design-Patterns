package com.gofdp.behavioralpatterns.iterator.myutil;

public interface MyQueue<T> extends Iterable<T> {

	public void enqueue(T value);
	
	public T dequeue();
	
	public int size();
	
	public void clear();
}
