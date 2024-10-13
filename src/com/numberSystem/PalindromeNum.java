/*
 * 7. Palindrome Number  
   Write a Java program to check if a given number is a Palindrome. A palindrome number is a number that reads the same forwards and backwards.

   Explanation:  
   The number is reversed, and the reversed version is compared with the original number.

   Example:  
   Input: `121`  
   Output: `121 is a palindrome number`
 */
package com.numberSystem;

import java.util.Scanner;

public class PalindromeNum 
{
	public static void isPM(int n)
	{
		int sum=0;
		int rem=0;
		for(int i=n;i!=0;i/=10)
		{
			rem=i%10;
			sum=(sum*10)+rem;
		}
		if(sum==n)
		{
			System.out.println(n+" is a palindrome number");
		}
		else
		{
			System.out.println(n+" is a not palindrome number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Given number: ");
		int n=sc.nextInt();
		System.out.println("----------------------");
		isPM(n);
	}
}
