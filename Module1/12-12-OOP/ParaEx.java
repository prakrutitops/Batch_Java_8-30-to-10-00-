package com.a1212;

public class ParaEx 
{
	//variable
	int id;
	String name;
	
	//para constructor
	public ParaEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ParaEx p1 = new ParaEx(101, "Tejas");
		ParaEx p2 =new ParaEx(102, "Prakruti");
		
		p1.display();
		p2.display();
		
	}

}
