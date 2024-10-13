/*
 * 2. Neon Number  
   Write a Java program to check if a given number is a Neon Number. A neon number is a number where the sum of the digits of its square equals the number itself.

   Explanation:  
   The square of the number is calculated, and the sum of its digits is compared to the original number.

   Example:  
   Input: `9`  
   Output: `9 is a neon number`  
   (9² = 81 → 8 + 1 = 9)
 */
package com.numberSystem;

public class NeonNumber 
{
	public static String isNN(int n)
	{
		int sq=n*n;
		int t=sq;
		int sum=0;
		while(t!=0)
		{
			int r=t%10;
			sum+=r;
			t/=10;
		}
		if(sum==n)
		{
			return n+" is a neon number";
		}
		else
		{
			return n+" is a not neon number";
		}
	}
	public static void main(String[] args) 
	{
		int n=9;
		System.out.println(isNN(n));
	}
}
