package com.harsh.hackerank.practice.hard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

    	int[] manipulationArray = new int[n];
    	
    	for (int j = 0; j < manipulationArray.length; j++) {
			System.out.print(manipulationArray[j] + " ");
		}
    	System.out.println();
    	int startIndex = 0;
    	int endIndex = n - 1;
    	for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			startIndex = (query[0] - 1) > startIndex ? (query[0] - 1) : startIndex;
			endIndex = (query[1] - 1) < endIndex ? (query[1] - 1) : endIndex;
			System.out.println("startIndex: " + startIndex + " endIndex: " + endIndex);
			for (int j = startIndex; j <= endIndex; j++) {
				manipulationArray[j] += query[2];
			}
			for (int j = 0; j < manipulationArray.length; j++) {
				System.out.print(manipulationArray[j] + " ");
			}
			System.out.println();
		}
    	
    	long biggest = 0;
    	for (int i = 0; i < manipulationArray.length; i++) {
    		if (manipulationArray[i] > biggest) {
				biggest = manipulationArray[i];
			}
		}
    	
    	return biggest;
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

