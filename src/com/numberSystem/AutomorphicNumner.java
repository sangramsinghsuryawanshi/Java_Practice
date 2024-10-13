/*
 * 
4. Automorphic Number  
   Write a Java program to check if a given number is an Automorphic Number. An automorphic number is a number whose square ends with the same digits as the number itself.

   Explanation:  
   The square of the number is calculated, and the last digits are checked to see if they match the original number.

   Example:  
   Input: `76`  
   Output: `76 is an automorphic number`  
   (76² = 5776)
 */
package com.numberSystem;

public class AutomorphicNumner 
{
	public static void isAM(int n)
	{
		int cnt=1;
		int num=1;
		while(cnt<n)
		{
			if(isV(num))
			{
				System.out.println(num);
				cnt++;
			}
			num++;
		}
	}
	public static boolean isV(int n)
	{
		int sq=n*n;
		String s=Integer.toString(n);
		String s1=Integer.toString(sq);
		return s1.endsWith(s);
	}
	public static void main(String[] args) 
	{
		int n=5;
		isAM(n);
	}
}
