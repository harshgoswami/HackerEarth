package com.harsh.testdome;

import java.util.stream.*;
import java.util.*;

public class TopStudentScoreListBByComparator {
	
	public static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getScore() < o2.getScore() ? -1 : (o2.getScore() == o1.getScore() ? 0 : 1);
		}
		
	}
	
	public static class Student {
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

		// This also works
//		return students.filter(stu -> stu.getScore() >= 50).sorted(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getScore() < o2.getScore() ? -1 : (o2.getScore() == o1.getScore() ? 0 : 1);
//			}
//		}.reversed()).map(stu -> stu.getName()).collect(Collectors.toList());
		
		// This also works
		return students.filter(stu -> stu.getScore() >= 50).sorted(new StudentComparator().reversed())
				.map(stu -> stu.getName()).collect(Collectors.toList());
		
		// This also works
//		return students.filter(stu -> stu.getScore() >= 50).sorted(Comparator.comparing(Student::getScore).reversed())
//				.map(stu -> stu.getName()).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Mike", 80));
		students.add(new Student("James", 57));
		students.add(new Student("Alan", 21));
		students.add(new Student("Micky", 50));
		students.add(new Student("Cameron", 88));

		studentsThatPass(students.stream(), 50).forEach(System.out::println);
	}
}
