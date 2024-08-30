package com.student;

public class Student {
	private static int studentid=550;
	private char stype;
	private String studentname;
	
	public Student()
	{
		studentid++;
	}

	public Student(char stype,String firstname,String Lastname) {
		super();
		studentid++;
		this.stype = stype;
		this.studentname=firstname+Lastname;
	}
	
	public void displayDetails() {
		System.out.println("Student_id :"+this.studentid);
		System.out.println("Student type :"+this.stype);
		System.out.println("Student name :"+this.studentname);
	}
	
}
