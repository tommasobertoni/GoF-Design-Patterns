package com.gofdp.behavioralpatterns.strategy.sorting;

import java.util.List;

public class InsertionSort extends AbstractSortingAlgorithm {

	@Override
	public <E extends Comparable<E>> void sort(List<E> list) {
		for (int i = 1; i < list.size(); i++)
			for (int j = i; j > 0 ; j--)
				if (list.get(j - 1).compareTo(list.get(j)) > 0)
					swap(list, j - 1, j);
	}
}
