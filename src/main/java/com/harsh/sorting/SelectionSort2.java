package com.harsh.sorting;

import java.util.Arrays;

public class SelectionSort2 {

public static void main(String[] args) {
		
//		Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		Integer a[] = new Integer[] {-1, 20, 35, -15, 7, 55, 1, -22, 2};
		
		int iterations = 0;
		
		for (int lastUnSortedIndex = a.length - 1; lastUnSortedIndex > 0 ; lastUnSortedIndex--, iterations++) {
			
			// Diff
			// Considering Largest Index as the last index of unsorted array
			int largestIndex = lastUnSortedIndex;
			
			for (int j = 0; j < lastUnSortedIndex; j++, iterations++) {
				
				if (a[j] > a[largestIndex]) {
					largestIndex = j;
				}
			}
			swap(a, largestIndex, lastUnSortedIndex);
		}
		
		System.out.println(iterations);
		System.out.println(Arrays.toString(a));
	}

	private static void swap(Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
