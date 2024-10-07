/*
 * Factorial of a Number: Write a recursive function to calculate the factorial of a number.

Input: 5
Output: 120 (because 5! = 5 * 4 * 3 * 2 * 1)
 */
package com.Recursion;

public class Factorial 
{
	static int fact=1;
	public static void isFact(int n)
	{
		
		if(n==0)
		{
			System.out.println(fact);
		}
		else
		{
			fact*=n;
			isFact(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isFact(n);
	}
}
