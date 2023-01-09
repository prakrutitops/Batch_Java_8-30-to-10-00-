package com.a61;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		Student s =new Student(101, "Dhruvil");
		FileOutputStream fout =new FileOutputStream("E://Tejas.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		System.out.println("success");
	}
}
