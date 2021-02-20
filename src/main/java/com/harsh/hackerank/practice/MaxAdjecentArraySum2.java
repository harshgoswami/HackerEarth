package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxAdjecentArraySum2 {

	// Complete the maxSubsetSum function below.
	static int maxSubsetSum(int[] arr) {
		System.out.println();
		printArray(arr);
		if (arr.length == 0)
			return 0;

		arr[0] = Math.max(0, arr[0]);
		printArray(arr);
		if (arr.length == 1)
			return arr[0];

		arr[1] = Math.max(arr[0], arr[1]);
		printArray(arr);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
			printArray(arr);
		}

		return arr[arr.length - 1];

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/logs"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int res = maxSubsetSum(arr);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
