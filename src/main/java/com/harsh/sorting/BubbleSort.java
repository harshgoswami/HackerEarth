package com.harsh.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
//		Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22};
		
		int iterations = 0;
		
		for (int i = 0; i < a.length; i++, iterations++) {
			
			for (int j = 0; j < a.length - 1; j++, iterations++) {
				
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println(iterations);
		System.out.println(Arrays.toString(a));
	}
	
}
