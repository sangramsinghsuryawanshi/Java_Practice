/*
 * Fibonacci Series: Write a recursive function to return the nth Fibonacci number.

Input: 7
Output: 13 (because the 7th Fibonacci number is 13)
 */
package com.Recursion;

public class FibonacciSeries 
{
	static int a=0;
	static int b=1;
	static int sum=0;
	public static void isFi(int num)
	{
		if(num>0)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			isFi(num-1);
		}
		
	}
	public static void main(String[] args) 
	{
		isFi(10);
	}
}
