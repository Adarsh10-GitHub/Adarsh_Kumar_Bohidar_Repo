package com.assignment;

public class SwitchCase {
	public static void main(String[] args) {
		
		char grade = 'X';
		
		switch (grade) {
		case 'A':
			System.out.println("Score is between 80 to 100");
			break;
		case 'B':
			System.out.println("Score is between 73 to 79");
			break;
		case 'C':
			System.out.println("Score between 65 to 72");
			break;
		case 'D':
			System.out.println("Score between 55 to 64");
			break;
		case 'E':
			System.out.println("Score less than 55");
			break;
		default:
			System.out.println("grade doesn't exist");
			break;
		}
		
	}
}
