package com.harsh.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
//		Integer a[] = new Integer[] { 22, 13, 7, 55, -22, 1, 8 };
		Integer a[] = new Integer[] {-1, 20, 35, -15, 7, 55, 1, -22, 2, 8, 121};

		int iterations = 0;

		for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--, iterations++) {

			// Diff
//			Considering Largest Index as the first index of unsorted array
			int largestIndex = 0;
			for (int j = 1; j <= lastUnsortedIndex; j++, iterations++) {

				if (a[j] > a[largestIndex]) {
					largestIndex = j;
				}
			}

			int temp = a[lastUnsortedIndex];
			a[lastUnsortedIndex] = a[largestIndex];
			a[largestIndex] = temp;
		}

		System.out.println(iterations); // 27 Iterations for 7 elements, better than bubble sort O(n^2)
		System.out.println(Arrays.toString(a));
	}
	
	public static void main1(String[] args) {
//		Integer a[] = new Integer[] { 22, 13, 7, 55, -22, 1, 8 };
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22};

		int iterations = 0;

		int smallestIndex = 0;
		for (int firstUnsortedIndex = 0; firstUnsortedIndex < a.length; firstUnsortedIndex++, iterations++) {
			for (int j = firstUnsortedIndex + 1; j < a.length; j++, iterations++) {

				if (a[j] < a[smallestIndex]) {
					smallestIndex = j;
				}
			}

			int temp = a[firstUnsortedIndex];
			a[firstUnsortedIndex] = a[smallestIndex];
			a[smallestIndex] = temp;
			smallestIndex = firstUnsortedIndex + 1;
		}

		System.out.println(iterations); // 28 Iterations for 7 elements, better than bubble sort O(n^2)
		System.out.println(Arrays.toString(a));
	}

	// Not sure which sorting algo I have implemented. It has same fnCalls as
	// selection sort
	public static void main3(String[] args) {

//		Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22, 22, 13, 7, 55};
		
		int iterations = 0;
		
		for (int i = 1; i < a.length; i++, iterations++) {
			
			for (int j = i; j > 0; j--, iterations++) {
				
				if (a[j] > a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
			
		}
		
		System.out.println(iterations);
		System.out.println(Arrays.toString(a));
	}
	
}
