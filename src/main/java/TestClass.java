import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	public static void main(String args[]) throws Exception {

		/*
		 * Sample code to perform I/O: Use either of these methods for input //Scanner
		 * Scanner s = new Scanner(System.in); String name = s.nextLine(); // Reading
		 * input from STDIN System.out.println("Hi, " + name + "."); // Writing output
		 * to STDOUT
		 * 
		 */

		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		int t = Integer.parseInt(br.readLine()); // Reading input from STDIN

		List<Integer> nList = new ArrayList<Integer>();
		
		 String line;
		while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
		
//		int i = 1;
//		for (String line = br.readLine(); ++i <= t; line = br.readLine()) {
//			System.out.println(line + " added");
//			nList.add(Integer.parseInt(line));
//		}
		
//		for (Integer integer : nList) {
//			System.out.println(integer);
//		}

		// Write your code here

	}
}
