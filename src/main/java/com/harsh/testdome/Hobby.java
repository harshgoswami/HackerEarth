package com.harsh.testdome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Hobby {

	private final HashMap<String, String[]> hobbies = new HashMap<>();
	
	private void add(String hobbyist, String... hobbies) {
		this.hobbies.put(hobbyist, hobbies);
	}

	public List<String> findAllHobbyists(String hobby) {
		List<String> hobbyists = new ArrayList<String>();
	
		for (Entry<String, String[]> entry : this.hobbies.entrySet()) {
			System.out.println(entry.getKey() + " BS : " + Arrays.toString(entry.getValue()));
			Arrays.sort(entry.getValue());
			System.out.println(entry.getKey() + " AS : " + Arrays.toString(entry.getValue()));
			if (Arrays.binarySearch(entry.getValue(), hobby) > 0) {
				hobbyists.add(entry.getKey());
			}
		}
		return hobbyists;
	}
	
	public static void main(String[] args) {
		Hobby hobby = new Hobby();
		hobby.add("Steve", "Fashion", "Piano", "Reading");
		hobby.add("Patty", "Drama", "Magic", "Pets");
		hobby.add("Chad", "Puzzles", "Pets", "Yoga");
		
		System.err.println(Arrays.toString(hobby.findAllHobbyists("Pets").toArray()));
	}
}
