package com.harsh.hackerank.practice.hard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Working Example without Sysout
public class ArrayManipulation2 {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

    	int[] manipulationArray = new int[n];
    	
    	for (int j = 0; j < manipulationArray.length; j++) {
			System.out.print(manipulationArray[j] + " ");
		}
    	System.out.println();
    	Map<Long, Long> map = new HashMap<>();
    	long start = 0;
    	long end = n - 1;
    	for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			start = query[0] ;
			end = query[1];
			long value = query[2];
			System.out.println("startIndex: " + start + " endIndex: " + end);
			 
			map.put(start, (map.containsKey(start) ? map.get(start) : 0) + value);
	        map.put(end + 1, (map.containsKey(end + 1) ? map.get(end + 1) : 0) - value);
	            
			for (int j = 0; j < manipulationArray.length; j++) {
				System.out.print(manipulationArray[j] + " ");
			}
			System.out.println();
		}
    	
    	 long max = 0;
         long value = 0;
         for (long i = 0; i < n; i++) {
             value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
             max = Math.max(max, value);
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

