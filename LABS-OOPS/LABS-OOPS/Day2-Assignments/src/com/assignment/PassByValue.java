package com.assignment;

public class PassByValue {
	
	public static void main(String[] args) {
		
		int sid=70;
		
		PassByValue val = new PassByValue();
		System.out.println(sid);
		val.passValue(sid);
		System.out.println(sid);
		
	}
		public void passValue(int sid) {
			sid=10;
			System.out.println("the sid is  "+sid);
		}
	
}
