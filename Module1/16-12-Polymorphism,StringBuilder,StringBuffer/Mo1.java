package com.a1612;

public class Mo1 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(add(5,6,2));
		System.out.println(add(5,6,7));
	}
}
