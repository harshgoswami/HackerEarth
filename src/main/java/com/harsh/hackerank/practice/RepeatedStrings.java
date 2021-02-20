package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	if (s == null || s.length() == 0) {
			return 0;
		} else if (s.length() == 1 ) {
			return s.charAt(0) == 'a' ? n : 0;
		}
    	
    	char[] charArray = s.toCharArray();
    	long countAs = 0;
    	for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				countAs++;
			}
		}
    	
    	long divisor = n / charArray.length;
    	System.out.println("divisor = " +divisor);
    	long finalCount = countAs * divisor;
    	
    	long remainder = n % charArray.length;
    	for (int i = 0; i < remainder; i++) {
			if (charArray[i] == 'a') {
				finalCount++;
			}
		}
    	return finalCount;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

