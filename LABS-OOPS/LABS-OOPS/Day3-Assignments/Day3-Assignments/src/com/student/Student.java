package com.student;

public class Student {
	
	private static int studentCount=10;
	private int studentid;
	private char stype;
	private String studentname;
	
	public Student(){
		this.studentid=++studentCount;
	}

	public Student(char stype, String studentname) {
		super();
		this.stype = stype;
		this.studentname = studentname;
		this.studentid=++studentCount;
	}
	
	public static int getstudentCount() {
		
		return studentCount;
	}
	
	
}
