package com.matrix;

public class CreateMatrix {
	public static void main(String[] args) {
		int firstarray[][]= {{1,1,1},{1,1,1}};
		int secondarray[][]= {{2,2,2},{2,2,2}};
		
		System.out.println("matrix 1");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(firstarray[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("matrix 2");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(secondarray[i][j]+" ");
			}
			System.out.println();
		}
	
		System.out.println("Sum");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(firstarray[i][j] + secondarray[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
}
