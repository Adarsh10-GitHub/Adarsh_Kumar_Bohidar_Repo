package com.matrix;

public class MultidimensionalArray {
	public static void main(String[] args) {
		
		String[][] array= {{"Tony","JAVA","C","C++"},{"Thomas","JAVA","Linux"},{"Dinil","Linux","Oracle"},{"Delvin","RDMS","C#","ORACLE"}};
		
		for(String[] s:array) {
			if(s[0].equals("Delvin")) {
				
				for(int i=1;i<s.length;i++) {
					System.out.println(s[i]);
				}
			}
		}
	}
}
