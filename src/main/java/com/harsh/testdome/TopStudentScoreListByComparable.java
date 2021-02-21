package com.harsh.testdome;

import java.util.stream.*;
import java.util.*;

public class TopStudentScoreListByComparable {
	
	public static class Student implements Comparable<Student> {
		
		private String name;
		private int score;

		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}

		public int getScore() {
			return score;
		}

		public String getName() {
			return name;
		}

		@Override
		public int compareTo(Student o) {
			return this.score < o.getScore() ? -1 : (o.getScore() == this.score ? 0 : 1);
		}
	}

	/**
	 * Return Student names whose passing score >= 50 in descending passing score
	 * order
	 * 
	 * @param students
	 * @param passingScore
	 * @return
	 */
	public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {

		return students.filter(stu -> stu.getScore() >= 50).sorted(Comparator.reverseOrder()).map(stu -> stu.getName())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Mike", 80));
		students.add(new Student("James", 57));
		students.add(new Student("Alan", 21));

		studentsThatPass(students.stream(), 50).forEach(System.out::println);
	}
}
