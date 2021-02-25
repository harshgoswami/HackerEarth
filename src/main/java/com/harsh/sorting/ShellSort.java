package com.harsh.sorting;

import java.util.Arrays;

public class ShellSort {

public static void main(String[] args) {
		
//		Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		Integer a[] = new Integer[] {20, 35, -15, 7, 55, 1, -22};
//		Integer a[] = new Integer[] {20, 35, -15, 7, 551, 11, -22, 22, 13, 78, 55, -11, 1, 8};
		
		int iterations = 0;
		
		for (int gap = a.length / 2; gap > 0; gap /= 2, iterations++) {
			
			for (int i = gap; i < a.length; i++, iterations++) {
				
				int newElement = a[i];
				
				int j = i;
				
				while (j >= gap && a[j - gap] > newElement) {
					iterations++;
					
					a[j] = a[j - gap];
					
					j -= gap;
				}
				a[j] = newElement;
			}
			
		}
		
		System.out.println(iterations); // 22 Iterations for 7 elements
		System.out.println(Arrays.toString(a));
	}
	
}
