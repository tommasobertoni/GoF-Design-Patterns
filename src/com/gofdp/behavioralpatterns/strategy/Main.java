package com.gofdp.behavioralpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gofdp.behavioralpatterns.strategy.sorting.*;

public class Main {
	
	private static Random rand = new Random(4);

	public static void main(String[] args) {
		
		ListSorter lc = new ListSorter();
		
		List<Integer> numbers = new ArrayList<>();
		insertNumbers(numbers, 9);
		List<String> strings = new ArrayList<>();
		insertStrings(strings, 10);
		
		AbstractSortingAlgorithm[] sortingAlhorithms = new AbstractSortingAlgorithm[3];
		sortingAlhorithms[0] = new InsertionSort();
		sortingAlhorithms[1] = new BubbleSort();
		sortingAlhorithms[2] = new Quick3Sort();
		
		for (AbstractSortingAlgorithm isa : sortingAlhorithms) {
			String completeAlgName = isa.getClass().getName();
			System.out.println("Algorithm: " +
					completeAlgName.substring(completeAlgName.lastIndexOf(".") + 1, completeAlgName.length()));
			lc.setSortingAlgorithm(isa);
			
			System.out.println("Before: " + numbers);
			System.out.println("After:  " + lc.sort(new ArrayList<Integer>(numbers)));
			System.out.println("Desc:   " + lc.sortDesc(new ArrayList<Integer>(numbers)));
			System.out.println("Before: " + strings);
			System.out.println("After:  " + lc.sort(new ArrayList<String>(strings)));
			System.out.println("Desc:   " + lc.sortDesc(new ArrayList<String>(strings)));
			System.out.println();
		}
	}
	
	private static void insertNumbers(List<Integer> list, int count) {
		for (int i = 0; i < count; i++)
			list.add(rand.nextInt(100));
	}
	
	private static void insertStrings(List<String> list, int count) {
		for (int i = 0; i < count; i++)
			for (int j = 0; j < 3; j++)
				list.add(String.format("%s%s", 
						 (char)(rand.nextInt(26) + 65),
						 (char)(rand.nextInt(26) + 65)));
	}
}
