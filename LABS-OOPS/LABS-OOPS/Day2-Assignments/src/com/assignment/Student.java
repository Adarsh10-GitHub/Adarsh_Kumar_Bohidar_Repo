package com.assignment;

public class Student {
	private int studentID;
	private char studentType;
	
	public Student() {
		studentID=7;
		studentType='F';
	}
	
	
	
	public Student(int studentID, char studentType) {
		super();
		this.studentID = studentID;
		this.studentType = studentType;
	}



	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
}
