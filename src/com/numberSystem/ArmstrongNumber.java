/*
 * 3. Armstrong Number  
   Write a Java program to check if a given number is an Armstrong Number. An Armstrong number is a number that is equal to the sum of its digits raised to the power of the number of digits.

   Explanation:  
   The number is split into its digits, and each digit is raised to the power of the total number of digits. The sum is then compared with the original number.

   Example:  
   Input: `153`  
   Output: `153 is an Armstrong number`  
   (1³ + 5³ + 3³ = 153)
 */
package com.numberSystem;

public class ArmstrongNumber 
{
	public static String isAM(int n)
	{
		int t=n;
		int rev=0;
		while(t!=0)
		{
			int r=t%10;
			rev+=(r*r*r);
			t/=10;
		}
		if(rev==n)
		{
			return n+" is an Armstrong number";
		}
		else
		{
			return n+" is an not Armstrong number";
		}
	}
	public static void main(String[] args) 
	{
		int n=153;
		System.out.println(isAM(n));
	}
}
