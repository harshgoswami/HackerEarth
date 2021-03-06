import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass2 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

         */
        //Scanner
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());                 // Reading input from STDIN

        List<Integer> nList = new ArrayList<Integer>();
        
        int i = 0;
        while (s.hasNext() && i < t) {
			nList.add(Integer.parseInt(s.nextLine()));
			i++;
		}
        
        for (Integer ii : nList) {
			
        	for (Integer j = 1; j <= ii; j++) {
				
        		int jLen = j.toString().length();
        		
        		if (jLen == 1) {
					
				}
        		
        		System.out.println(j+" length = "+j.toString().length());
        		break;
			}
        	
		}
        

        // Write your code here

    }
}
