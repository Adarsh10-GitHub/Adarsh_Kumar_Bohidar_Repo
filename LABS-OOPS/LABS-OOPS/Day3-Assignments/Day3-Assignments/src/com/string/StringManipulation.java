package com.string;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user=args[0];
		int l = user.length();
		System.out.println(l);
		System.out.println("Hi "+ user);
		System.out.println(user.toLowerCase());
		System.out.println(user.toUpperCase());
		System.out.println(user.startsWith("a"));
		System.out.println(user.replace(user, "SEED"));
	}

}
