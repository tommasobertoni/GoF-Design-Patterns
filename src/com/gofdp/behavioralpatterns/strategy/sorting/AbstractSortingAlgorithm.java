package com.gofdp.behavioralpatterns.strategy.sorting;

import java.util.List;
import java.lang.Comparable;

public abstract class AbstractSortingAlgorithm {

	public abstract <E extends Comparable<E>> void sort(List<E> list);
	
	protected <E extends Comparable<E>> void swap(List<E> list, int index1, int index2) {
		
		if (index1 == index2) return;
		
		E a = list.get(index1);
		E b = list.get(index2);
		list.set(index1, b);
		list.set(index2, a);
	}
}
