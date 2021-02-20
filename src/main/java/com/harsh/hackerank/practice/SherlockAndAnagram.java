package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// left half.. not a good solution... need to do brute force
public class SherlockAndAnagram {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

    	Map<String, Integer> anagramMap = new HashMap<String, Integer>();
    	
    	for (int i = 0; i < s.length(); i++) {
			String sChar = Character.toString(s.charAt(i));
    		if (anagramMap.get(sChar) == null) {
    			anagramMap.put(sChar, 1);
			} else {
				anagramMap.put(sChar, anagramMap.get(sChar) + 1);
			}
    		
    		for (int j = i + 1; j < s.length(); j++) {
    			
    			String jChar = Character.toString(s.charAt(i));
    			
    			if (anagramMap.get(sChar) == null) {
        			anagramMap.put(sChar, 1);
    			} else {
    				anagramMap.put(sChar, anagramMap.get(sChar) + 1);
    			}
			}
    		
		}
    	
    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/logs"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

