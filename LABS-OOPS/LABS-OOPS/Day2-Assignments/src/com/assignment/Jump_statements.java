package com.assignment;

public class Jump_statements {
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<10;j++) 
			{
				System.out.println(j+"\t");
				if(j>5) 
				{
					break;
				}
			}
			System.out.println("Outer");
		}
		
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<10;j++) 
			{
				System.out.println(j+"\t");
				if(j>5) 
				{
					System.out.println();
					continue;
				}
			}
			System.out.println("Outer");
		}
		
		
		
		System.out.println("END");
	}
	
	
}
