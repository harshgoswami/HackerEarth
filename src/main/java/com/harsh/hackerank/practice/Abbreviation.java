package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Abbreviation {

	public static void main1(String[] args) {
		
		System.out.println("beFgH".toLowerCase().contains("EFG".toLowerCase()) ? "YES" : "NO");
		int asciiOfA = (int) 'A';
		char aa = (char)(asciiOfA + 32);
		System.out.println((int) 'A');
		System.out.println(aa);
	}
	
    // Complete the abbreviation function below.
    static String abbreviation(String a, String b) {
        
    	int bIndex = 0;
    	int aIndex = 0;
    	boolean found = false;
    	for (int i = 0; i < a.length(); i++) {
			if (Character.toUpperCase(a.charAt(i)) == b.charAt(bIndex)) {
				if (bIndex == b.length() - 1) {
					found = true;
					aIndex = i+1;
					bIndex++;
					break;
				}
				bIndex++;
			} else if (Character.isLowerCase(a.charAt(i))) {
				
			} else if (Character.isUpperCase(a.charAt(i))) {
				
			} {
				bIndex = 0;
			}
		}
    	
    	for (int i = aIndex; i < a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i)) 
//					&& a.charAt(i) != b.charAt(bIndex - 1)
					) {
				found = false;
				break;
			}
		}
    	System.out.println(found ? "YES" : "NO");
		return found ? "YES" : "NO";
    	
//    	int bIndex = b.length()-1;
//    	int aIndex = 0;
//    	boolean found = false;
//    	for (int i = a.length() - 1; i >= 0 ; i--) {
//			if (Character.toUpperCase(a.charAt(i)) == b.charAt(bIndex)) {
//				if (bIndex == 0) {
//					found = true;
//					aIndex = i-1;
//					bIndex--;
//					break;
//				}
//				bIndex--;
//			} else if (Character.isLowerCase(a.charAt(i))) {
//				
//			}
//		}
//    	
//    	for (int i = aIndex; i >= 0 ; i--) {
//			if (Character.isUpperCase(a.charAt(i)) 
////					&& a.charAt(i) != b.charAt(bIndex - 1)
//					) {
//				found = false;
//				break;
//			}
//		}
//    	System.out.println(found ? "YES" : "NO");
//		return found ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/logs"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

