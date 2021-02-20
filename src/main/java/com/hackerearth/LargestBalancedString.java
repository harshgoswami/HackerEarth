package com.hackerearth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

//5
//(){}()[]
//))[]]((
//{{{{{{{}
//[]{}]
//{}}

public class LargestBalancedString {

	static int sum = 0;
	static int maxi = 0;
	static int oIndex = -1;

	static List<Integer> output = new ArrayList<>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<String> inputs = new ArrayList<>();
		IntStream.range(0, n).forEach((i) -> {
			inputs.add(sc.next());
		});

		inputs.forEach((str) -> {
			Iterator<Character> charIterator = str.chars().mapToObj((i) -> (char) i).iterator();
			sum = 0;
			maxi = 0;
			oIndex++;
			int openingCircleBracketsCount = 0;
			int closingCircleBracketsCount = 0;
			int openingCurlyBracketsCount = 0;
			int closingCurlyBracketsCount = 0;
			int openingSquareBracketsCount = 0;
			int closingSquareBracketsCount = 0;
			
			while (charIterator.hasNext()) {
				Character chr = (Character) charIterator.next();
				if (chr == '(')
					openingCircleBracketsCount++;
				else if (chr == '{')
					openingCurlyBracketsCount++;
				else if (chr == '[')
					openingSquareBracketsCount++;
				else if (chr == ')')
					closingCircleBracketsCount++;
				else if (chr == '}')
					closingCurlyBracketsCount++;
				else if (chr == ']')
					closingSquareBracketsCount++;
			}
			int pairs = 0;
			
			if (openingCircleBracketsCount > closingCircleBracketsCount)
				pairs += closingCircleBracketsCount;
			else 
				pairs += openingCircleBracketsCount;
			
			if (openingCurlyBracketsCount > closingCurlyBracketsCount)
				pairs += closingCurlyBracketsCount;
			else 
				pairs += openingCurlyBracketsCount;
			
			if (openingSquareBracketsCount > closingSquareBracketsCount)
				pairs += closingSquareBracketsCount;
			else 
				pairs += openingSquareBracketsCount;
			
			output.add(pairs * 2);
		});
		output.forEach(System.out::println);
	}

}
