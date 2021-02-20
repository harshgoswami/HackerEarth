package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class BubbleSortCountSwaps {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	
		int n = a.length;
		int firstElement = 0;
		int lastElement = 0;
		int swapCount = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - 1; j++) {

				if (a[j] > a[j + 1]) {
					swapCount++;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		if (n > 0) {
			firstElement = a[0];
			lastElement = a[n - 1];
		}

		System.out.println("Array is sorted in " + swapCount + " swaps");
		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element: " + lastElement);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
