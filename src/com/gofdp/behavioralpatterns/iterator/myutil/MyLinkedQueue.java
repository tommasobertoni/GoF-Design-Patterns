package com.gofdp.behavioralpatterns.iterator.myutil;

import java.util.Iterator;

public class MyLinkedQueue<T> implements MyQueue<T> {

	protected MyNode head, tail;
	protected int size;
	
	public MyLinkedQueue() {
		head = new MyNode(null, null, null);
		size = 0;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyLinkedQueueIterator();
	}

	@Override
	public void enqueue(T value) {
		
		if (head.value == null) {
			head.value = value;
		} else if (tail == null) {
			tail = new MyNode(head, null, value);
			head.next = tail;
		} else {
			MyNode newTail = new MyNode(tail, null, value);
			newTail.prior = tail;
			tail.next = newTail;
			tail = newTail;
		}
		
		size++;
	}

	@Override
	public T dequeue() {
		
		T value;
		
		value = head.value;
		if (head.next != null) {
			head = head.next;
		} else head.value = null;
		
		if (value != null)
			size--;
		
		return value;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		tail = null;
		head.next = null;
		head.value = null;
		size = 0;
	}
	
	protected class MyNode {

		MyNode prior, next;
		T value;
		
		public MyNode (MyNode prior, MyNode next, T value) {
			this.prior = prior;
			this.next = next;
			this.value = value;
		}
	}
	
	private class MyLinkedQueueIterator implements Iterator<T> {
		
		private int _counter;
		private MyNode _lastNode;

		@Override
		public boolean hasNext() {
			
			if (_lastNode == null) _lastNode = head;
			
			return _lastNode.value != null && _counter < size;
		}

		@Override
		public T next() {
			
			T value = _lastNode.value;
			_counter++;
			_lastNode = _lastNode.next;
			
			return value;
		}
	}
}
