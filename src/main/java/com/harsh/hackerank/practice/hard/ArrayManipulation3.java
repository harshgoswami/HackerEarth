package com.harsh.hackerank.practice.hard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation3 {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

    	//for index 0 as dummy
    	int[] numbers = new int[n+1];
    	
    	for (int j = 1; j < numbers.length; j++) {
			System.out.print(numbers[j] + " ");
		}
    	System.out.println();
    	
    	for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			int a = query[0] ;
			int b = query[1];
			long k = query[2];
			
			numbers[a] += k;
			if(b + 1 <= n){
				numbers[b+1] -= k;
			}
			
			for (int j = 1; j < numbers.length; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}
    	
    	long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i = 1; i < numbers.length; i++){
			sum = sum + numbers[i];
			if(sum > max){
				max = sum;
			}
		}
    	
    	return max;
    }
    
    public static void main1(String[] args) {
    	int[] manipulationArray = new int[5];
    	System.out.println("a"+manipulationArray[4]);
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/log.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

