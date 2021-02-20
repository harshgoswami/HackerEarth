package com.harsh.hackerank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumBribeRideQueue {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        
//    	int bribeCount = 0;
//    	boolean tooChaotic = false;
//    	int tooChaoticConsecutiveSwapCounter = 0;
//    	for (int i = 0; i < q.length; i++) {
//    		for (int j = 0; j < q.length - 1; j++) {
//				if (q[j] > q[j+1]) {
//					int temp = q[j];
//					q[j] = q[j+1];
//					q[j+1] = temp;
//					bribeCount++;
//					tooChaoticConsecutiveSwapCounter++;
//				} else {
//					tooChaoticConsecutiveSwapCounter = 0;
//				}
//				if (tooChaoticConsecutiveSwapCounter>2) {
//					tooChaotic = true;
//					break;
//				}
//			}
//    		if (bribeCount == 0) {
//				break;
//			}
//    	}
    	
    	int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
        	
        	for (int k = 0; k < q.length; k++) {
				System.out.print(q[k] + " ");
			}
        	System.out.println("\n");
        	
			System.out.println("i = " + i + ", q[i] ~ q[" + i + "] = " + q[i]);
        	System.out.println("q[i] - (i + 1) = " + (q[i] - (i + 1)));
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            System.out.println("Too chaotic logic \n");
            
            System.out.println("++ logic below");
            System.out.println("i = " + i + ", q[i] ~ q[" + i + "] = " + q[i]);
            System.out.println("q[i] - 2 = " + (q[i] - 2));
            
            System.out.println("\nLooping from " + Math.max(0, q[i] - 2) + " to " + (i-1));
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
            	System.out.print(q[j] + " ");
            }
            System.out.println("\nAll Elements");
            for (int k = 0; k < q.length; k++) {
				System.out.print(q[k] + " ");
			}
            System.out.println("\n");
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
            	System.out.println("j = " + j + ", q[j] ~ q[" + j + "] = " + q[j]);
				System.out.println(
						"i = " + i + ", j = " + j + ", q[j] > q[i] ~ q[" + j + "] > q[" + i + "] = " + (q[j] > q[i]));
            	if (q[j] > q[i]) {
            		ans++;
            	}
            }
            System.out.println();
        }
        
//    	System.out.println(tooChaotic ? "Too chaotic" : bribeCount);
        System.out.println(ans);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

