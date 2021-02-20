package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlassSum2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    
    	List<Integer> sumList = new ArrayList<>();
    	
        for (int i = 0; i< (arr.length - 2); i++) {
            
			for (int j = 0; j < (arr[i].length - 2); j++) {

				int sum = 0;
				
				System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
				System.out.println(" " + " " + arr[i+1][j + 1] + " " + " ");
				System.out.println(arr[i+2][j] + " " + arr[i+2][j + 1] + " " + arr[i+2][j + 2] +"\n");
				
				sum += arr[i][j];
				sum += arr[i + 2][j];
				sum += arr[i][j + 1];
				sum += arr[i + 1][j + 1];
				sum += arr[i + 2][j + 1];
				sum += arr[i][j + 2];
				sum += arr[i + 2][j + 2];
				sumList.add(sum);
			}        
        }
        Collections.sort(sumList);
        System.out.println(sumList);
        System.out.println(sumList.get(sumList.size() - 1));
        return sumList.get(sumList.size() - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

