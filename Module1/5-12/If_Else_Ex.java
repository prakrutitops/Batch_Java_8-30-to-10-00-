package com.a512;

import java.util.Scanner;

public class If_Else_Ex 
{
	public static void main(String[] args) 
	{
		
			//int marks = 35;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Marks");
			int marks = sc.nextInt();
		
			if(marks>=35)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		
		
	}
}
