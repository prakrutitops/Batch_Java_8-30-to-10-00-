package com.a2112;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo 
{
	public static void main(String[] args) throws IOException 
	{
		
		//Data Write - FileOutputStream
		
		String MyData="Welcome to Tops";
		FileOutputStream fout = new FileOutputStream("E://Tejas.txt");
		fout.write(MyData.getBytes());
		System.out.println("Success");
		
	}
}
