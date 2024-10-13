/*
 * 1. Magic Number  
   Write a Java program to check if a given number is a Magic Number. A magic number is a number where the sum of its digits repeatedly results in 1.

   Explanation:  
   The number is broken into its digits, and the sum is repeatedly calculated until a single digit is obtained. If the final result is 1, the number is a magic number.

   Example:  
   Input: `19`  
   Output: `19 is a magic number`  
   (1 + 9 = 10 → 1 + 0 = 1)
 */
package com.numberSystem;

public class MagicNumber 
{
	public static void isMN(int a)
	{
		int rem=0;
		int t=a;
		int sum=0;
		while(t!=0)
		{
			rem=t%10;
			sum+=rem;
			t/=10;
		}
		if(isValid(sum)>=0 && isValid(sum)<=9)
		{
			System.out.println("Given Number is Magic number "+a+","+isValid(sum));
		}
	}
	public static int isValid(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int a=19;
		isMN(a);
	}

}
