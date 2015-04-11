package com.gofdp.behavioralpatterns.iterator;

import java.util.Iterator;

import com.gofdp.behavioralpatterns.iterator.myutil.MyLinkedQueue;
import com.gofdp.behavioralpatterns.iterator.myutil.OddEvenIterableLinkedQueue;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedQueue<Character> queue = new MyLinkedQueue<>();
		fillQueueWithChars(5, queue);
		
		System.out.println("MyLinkedQueue foreach");
		for (Character elem : queue) //uses iterator internally
			System.out.println(elem);
		System.out.println("-------------");
		
		OddEvenIterableLinkedQueue<Character> oequeue = new OddEvenIterableLinkedQueue<>();
		fillQueueWithChars(5, oequeue);
		
		System.out.println("OddEvenIterableLinkedQueue foreach");
		for (Character elem : oequeue) //uses iterator internally
			System.out.println(elem);
		System.out.println("-------------");
		
		System.out.println("OddEvenIterableLinkedQueue odd iterator");
		Iterator<Character> oddIterator = oequeue.oddIterator();
		while (oddIterator.hasNext())
			System.out.println(oddIterator.next());
		System.out.println("-------------");
		
		System.out.println("OddEvenIterableLinkedQueue even iterator");
		Iterator<Character> evenIterator = oequeue.evenIterator();
		while (evenIterator.hasNext())
			System.out.println(evenIterator.next());
	}
	
	private static void fillQueueWithChars(int elements, MyLinkedQueue<Character> queue) {
		for (int i = 0; i < elements; i++)
			queue.enqueue((char)(65 + i));
	}
}
