package com.a201;

public class ThrowEx 
{
	
	
		static void validate(int age)
		{
			if(age<18)
			{
				throw new ArithmeticException("Not Valid");
			}
			else
			{
				System.out.println("Valid");
			}
		}
	
	public static void main(String[] args)
	{
		
		validate(16);
		
	}
}
