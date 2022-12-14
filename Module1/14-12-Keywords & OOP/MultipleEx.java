package com.a1412;

interface M
{
	void m();
}
interface N
{
	void n();
}
class K implements M,N
{

	@Override
	public void n() 
	{
		// TODO Auto-generated method stub
		System.out.println("N executed");
	}

	@Override
	public void m() 
	{
		// TODO Auto-generated method stub
		System.out.println("M executed");
	}
	
}

public class MultipleEx 
{
	public static void main(String[] args) {
		
		
		K k1 =new K();
		k1.m();
		k1.n();
		
	}
}
