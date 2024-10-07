/*
 * Power of a Number (a^b): Write a recursive function to calculate a raised to the power b.

Input: a = 2, b = 4
Output: 16 (because 2^4 = 16)
 */
package com.Recursion;

public class PowerOfNo 
{
	static int c=1;
	public static void is(int a,int b)
	{
		if((b--)>0)
		{
			c*=a;
			is(a,b);
		}
	}
	public static void main(String[] args) 
	{
		is(2,4);
		System.out.println(c);
	}
}
