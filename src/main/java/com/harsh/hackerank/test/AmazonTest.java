package com.harsh.hackerank.test;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;



class Result {

    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER threshold
     */

    public static List<String> processLogs(List<String> logs, int threshold) {

    	Map<String, Integer> transactionCountMap = new HashMap<>();
    	
    	for (int i = 0; i < logs.size(); i++) {
			String log = logs.get(i);
			
			String[] transaction = log.split(" ");
			String user1 = transaction[0];
			String user2 = transaction[1];
//			if (transactionCountMap.get(key)) {
//				
//			}
			for (int j = 0; j < transaction.length - 1; j++) {
				String user = transaction[j];

				if (transactionCountMap.get(user) != null) {
					transactionCountMap.put(user, transactionCountMap.get(user) + 1);
				} else {
					transactionCountMap.put(user, 1);
				}
			}
		}
    	
    	List<String> userList = new ArrayList<>();
    	for (Entry<String, Integer> entry : transactionCountMap.entrySet()) {
			if (entry.getValue() >= threshold) {
				userList.add(entry.getKey());
			}
		}
    	
    	Collections.sort(userList);
    	
    	return userList;
    }

}

public class AmazonTest {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/AmazonTest.txt"));

        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.processLogs(logs, threshold);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
