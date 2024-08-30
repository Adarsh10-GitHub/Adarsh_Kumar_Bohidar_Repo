package com.assignment;

public class CourseManagement {
	public static void main(String[] args) {
		Student s1 = new Student(2,'L');
		Student s2 = new Student();
		
		//s1.setStudentID(100);
		//s1.setStudentType('F');
		
		System.out.println(s1.getStudentID()+" "+s1.getStudentType());
		System.out.println(s2.getStudentID()+" "+s2.getStudentType());

	}
}
