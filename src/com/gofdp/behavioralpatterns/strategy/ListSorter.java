package com.gofdp.behavioralpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gofdp.behavioralpatterns.strategy.sorting.AbstractSortingAlgorithm;

public class ListSorter {

	private AbstractSortingAlgorithm _sortingAlgorithm;
	
	public void setSortingAlgorithm(AbstractSortingAlgorithm sortingAlgorithm) {
		_sortingAlgorithm = sortingAlgorithm;
	}
	
	public <E extends Comparable<E>> List<E> sort(List<E> list)  {
		
		if (_sortingAlgorithm == null) throw new SortingAlgorithmNotDefinedException();
		
		List<E> sortedList = new ArrayList<>(list);
		_sortingAlgorithm.sort(sortedList);
		return sortedList;
	}
	
	public <E extends Comparable<E>> List<E> sortDesc(List<E> list) {
		List<E> sortedList = sort(list);
		Collections.reverse(sortedList);
		return sortedList;
	}
}

@SuppressWarnings("serial")
class SortingAlgorithmNotDefinedException extends RuntimeException {}
