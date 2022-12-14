package com.a1412;

public class Svm 
{
	int id;
	String name;
	static String college="Atmiya"; //static variable
	
	public Svm(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="VVP";
	}
	public static void main(String[] args) {
		
		change();
		
		
		Svm s1 =new Svm(101,"A");
		Svm s2 =new Svm(102,"B");
		
		s1.display();
		s2.display();
		
		
	}
}
