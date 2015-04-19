package com.gofdp.behavioralpatterns.strategy.sorting;

import java.util.List;

public class Quick3Sort extends AbstractSortingAlgorithm {

	@Override
	public <E extends Comparable<E>> void sort(List<E> list) {
		sort(list, 0, list.size() - 1);
	}

	private <E extends Comparable<E>> void sort(List<E> list, int start, int end) {
		
		if (end <= start) return;
		
		E val = list.get(start);
		int lt = start, // lower than
			gt = end, // greater than
			i = start + 1;
		
		while (i <= gt) {
			int cmp = list.get(i).compareTo(val);
			if (cmp < 0) swap(list, lt++, i++);
			else if (cmp > 0) swap(list, i, gt--);
			else i++;
		}
		
		sort(list, start, lt - 1);
		sort(list, gt + 1, end);
	}
}
