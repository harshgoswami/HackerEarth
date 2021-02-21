package com.harsh.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
//		Integer a[] = new Integer[] { 22, 13, 7, 55, -22, 1, 8 };
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22};

		int iterations = 0;

		for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--, iterations++) {

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

}
