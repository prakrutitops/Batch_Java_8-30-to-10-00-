package com.a512;

import java.util.Scanner;

public class Switch_Ex 
{
	public static void main(String[] args) 
	{
		
		
		//int num = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:
					System.out.println("English");
					break;
			case 2:
					System.out.println("Hindi");
					break;
			case 3:	
					System.out.println("Gujarati");
					break;
			
			default:System.out.println("Your Number is Not Valid");
		}
		
	}
}
