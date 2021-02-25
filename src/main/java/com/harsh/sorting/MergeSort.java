package com.harsh.sorting;

import java.util.Arrays;

public class MergeSort {

	static int fnCalls = 0;

	public static void main(String[] args) {

		// Integer a[] = new Integer[] {22, 13, 7, 55, -22, 1, 8};
		 Integer a[] = new Integer[] { 20, 35, -15, 7, 55, 1, -22 };
//		Integer a[] = new Integer[] { 20, 35, -15, 7, 551, 11, -22, 22, 13, 78, 55, -11, 1, 8 };

		mergeSort(a, 0, a.length);

		System.out.println(fnCalls); // 19 Fn Calls / iterations
		System.out.println(Arrays.toString(a));
	}

	// { 20, 35, -15, 7, 55, 1, -22 };
	private static void mergeSort(Integer[] a, int start, int end) {
		fnCalls++;
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		mergeSort(a, start, mid);
		mergeSort(a, mid, end);

		merge(a, start, mid, end);
	}

	// { 20, 35, -15, 7, 55, 1, -22 };
	private static void merge(Integer[] a, int start, int mid, int end) {
		fnCalls++;
		if (a[mid - 1] <= a[mid]) {
			return;
		}

		Integer[] tempArray = new Integer[end - start];
		int i = start;
		int j = mid;
		int tempIndex = 0;

		while (i < mid && j < end) {
			if (a[i] <= a[j]) {
				tempArray[tempIndex++] = a[i++];
			} else {
				tempArray[tempIndex++] = a[j++];
			}
		}
		System.arraycopy(a, i, a, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, a, start, tempIndex);
	}

}
