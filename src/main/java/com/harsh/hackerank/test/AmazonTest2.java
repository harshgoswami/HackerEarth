package com.harsh.hackerank.test;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;



class Result1 {

    /*
     * Complete the 'countGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY related as parameter.
     */

    public static int countGroups(List<String> related) {
    	// Form Matrix
    	int n = related.size();
    	int[][] matrix = new int[n][n];
    	
    	for (int i = 0; i < n; i++) {
    		String row = related.get(i);
    		for (int j = 0; j < n; j++) {
    			matrix[i][j] = row.charAt(j);
    		}
		}
    	
    	Map<Integer, Integer> relations = new HashMap<>();
    	
    	// Process matrix
    	for (int i = 0; i < matrix.length; i++) {
    		
    		for (int j = 0; j < matrix[i].length; j++) {
    			
    			if (i == j) {
    				relations.put(i, j);
					continue;
				}
    			
    			if (matrix[i][j] == 1) {
    				relations.put(i, j);
    			}
    		}
		}
    	
    	// Print relations
		for (Entry<Integer, Integer> relation : relations.entrySet()) {
			System.out.println(relation.getKey() + " => " + relation.getValue());
		}
		
		return 0;
    }

}

public class AmazonTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int relatedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> related = IntStream.range(0, relatedCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result1.countGroups(related);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
