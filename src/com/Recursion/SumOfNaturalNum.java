/*
 * Sum of Natural Numbers: Write a recursive function to find the sum of the first N natural numbers.

Input: 5
Output: 15 (because 1 + 2 + 3 + 4 + 5 = 15)
 */
package com.Recursion;

public class SumOfNaturalNum 
{
	static int sum=0;
	public static void isSum(int n)
	{
		if(n>0)
		{
			sum+=n;
			isSum(n-1);
		}
	}
	public static void main(String[] args) 
	{
		isSum(5);
		System.out.println(sum);
	}
}
