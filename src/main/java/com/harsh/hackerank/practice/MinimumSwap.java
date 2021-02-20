package com.harsh.hackerank.practice;

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

    	int swapCount = 0;
    	int pos = 0;
    	for (int i = 0; i < arr.length; i++) {
    		i = pos;
    		if (arr[i] != i+1) {
    			int temp = arr[i];
    			arr[i] = arr[temp - 1];
    			arr[temp - 1] = temp;
    			
    			pos = i;
    			swapCount++;
			} else 
				pos++;
		}
    	
    	System.out.println(swapCount);
    	
    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        scanner.close();
    }
}

