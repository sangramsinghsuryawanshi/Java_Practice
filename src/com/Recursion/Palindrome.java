package com.Recursion;

public class Palindrome 
{
	static int rev=0;
	static int rem=0;
	public static int isPal(int num)
	{
		if(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			return isPal(num);
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int n=101;
		int og=n;
		isPal(n);
		if(og==rev)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
