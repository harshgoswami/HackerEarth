package com.harsh.hackerank.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

    	Map<String, Integer> magMap = new HashMap<>();
    	for (int i = 0; i < magazine.length; i++) {
    		String magWord = magazine[i];
			Integer magWordCount = magMap.get(magWord);
			
			if (magWordCount == null) {
				magMap.put(magWord, 1);
			} else {
				magMap.put(magWord, magWordCount + 1);
			}
		}
    	
    	String ans = "Yes";
    	for (int i = 0; i < note.length; i++) {
			String noteWord = note[i];
			Integer magWordCountFound = magMap.get(noteWord);
			if (magWordCountFound == null) {
				ans = "No";
				break;
			} else {
				if (magWordCountFound == 1) {
					magMap.remove(noteWord);
				} else {
					magMap.put(noteWord, magWordCountFound - 1);
				}
			}
		}
    	System.out.println(ans);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

