package com.a1412;

class C1
{
	String color="black";
}
class C2 extends C1
{
	String color="white";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);//parent class variable refer
	}
}

public class SuperExc 
{
	public static void main(String[] args) 
	{
		
		C2 c2 =new C2();
		c2.display();
		
	}
}
