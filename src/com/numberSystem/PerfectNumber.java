/*
 * 5. Perfect Number  
   Write a Java program to check if a given number is a Perfect Number. A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).

   Explanation:  
   The divisors of the number (excluding the number itself) are summed up. If the sum equals the original number, it is a perfect number.

   Example:  
   Input: `6`  
   Output: `6 is a perfect number`  
   (1 + 2 + 3 = 6)
 */
package com.numberSystem;

public class PerfectNumber 
{
	public static void isPM(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is a not perfect number");
		}
	}
	public static void main(String[] args) 
	{
		int n=6;
		isPM(n);
	}
}
