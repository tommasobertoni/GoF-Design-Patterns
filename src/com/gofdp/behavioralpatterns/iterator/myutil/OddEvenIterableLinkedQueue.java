package com.gofdp.behavioralpatterns.iterator.myutil;

import java.util.Iterator;

public class OddEvenIterableLinkedQueue<T> extends MyLinkedQueue<T> {
	
	public Iterator<T> evenIterator() {
		return new LinkedQueueOddEvenIterator(false);
	}
	
	public Iterator<T> oddIterator() {
		return new LinkedQueueOddEvenIterator(true);
	}
	
	private class LinkedQueueOddEvenIterator implements Iterator<T> {
		
		private MyNode _lastNode;
		private int _counter;
		private boolean _odd;
		
		public LinkedQueueOddEvenIterator(boolean odd) {
			_odd = odd;
		}

		@Override
		public boolean hasNext() {
			
			if (_lastNode == null) _lastNode = head;
			return _lastNode.value != null && _counter < (_odd? size / 2 + size % 2 : size / 2);
		}

		@Override
		public T next() {
			
			T value;
			
			if (_odd && _counter != 0 || !_odd)
				_lastNode = _lastNode.next;
			
			if (_lastNode == null)
				value = null;
			else {
				value = _lastNode.value;
				_counter++;
				_lastNode = _lastNode.next;
			}
			
			return value;
		}
	}
}
