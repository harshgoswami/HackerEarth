package com.harsh.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main2(String[] args) {

//		Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22};
		
		int iterations = 0;
		int smallestIndex = 0;
		int lastSortedIndex = 0;
		
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
	
	public static void main(String[] args) {
		
		Integer intArray[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
//		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		int iterations = 0;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++, iterations++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--, iterations++) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
        
        System.out.println(iterations); // 20 Iterations for 7 elements
		System.out.println(Arrays.toString(intArray));
	}
	
}
