package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        
        int s1Len = s1.length();
        int s2Len = s2.length();
        
        int forLen = s1Len <= s2Len ? s2Len : s1Len;
        
        Map<String, Integer> charMap1 = new HashMap<String, Integer>();
        Map<String, Integer> charMap2 = new HashMap<String, Integer>();
        
        for(int i = 0; i < forLen; i++) {
			try {
				char c1 = s1.charAt(i);
				String sc1 = Character.toString(c1);

				if (charMap1.get(sc1) == null) {
					charMap1.put(sc1, 1);
				} 
				
				if (charMap2.get(sc1) != null) {
					return "YES";
				}
				
			} catch (Exception e) {
			}
            
			try {
				char c2 = s2.charAt(i);
				String sc2 = Character.toString(c2);
				
				if (charMap2.get(sc2) == null) {
	            	charMap2.put(sc2, 1);
	            } 
				
				if (charMap1.get(sc2) != null) {
	            	return "YES";
	            }
			} catch (Exception e) {
			}
            
//          if (c1 == c2) {
//				return "YES";
//			}
        }
        
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/logs"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
