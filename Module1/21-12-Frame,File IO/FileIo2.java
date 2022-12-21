package com.a2112;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIo2 
{
	public static void main(String[] args) throws IOException 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name =sc.next();
		
		System.out.println("Enter Your Surname");
		String surname =sc.next();
		
		String dname="\n Your Name is :";
		String dsurname="\n Your Surname is :";
		FileOutputStream fout =new FileOutputStream("E://Tejas2.txt");
		fout.write(dname.getBytes());
		fout.write(name.getBytes());
		fout.write(dsurname.getBytes());
		fout.write(surname.getBytes());
		
		System.out.println("Success");
		
		
		
		
	}
}
