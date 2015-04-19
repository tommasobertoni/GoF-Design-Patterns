package com.gofdp.behavioralpatterns.strategy.sorting;

import java.util.List;

public class BubbleSort extends AbstractSortingAlgorithm {

	public <E extends Comparable<E>> void sort(List<E> list) {
		
		boolean swapped;
		for (int i = 0; i < list.size(); i++) {
			swapped = false;
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j).compareTo(list.get(j - 1)) < 0) {
					swap(list, j, j - 1);
					swapped = true;
				}
			}
			
			if (!swapped) break;
		}
	}
}
