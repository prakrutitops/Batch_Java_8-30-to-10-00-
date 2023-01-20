package com.a201;

public class TryCatchEx 
{
	public static void main(String[] args)
	{
		
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Executed");
		}
		
	}
}
