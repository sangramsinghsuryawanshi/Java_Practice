/*
 * 8. Spy Number  
   Write a Java program to check if a given number is a Spy Number. A spy number is a number where the sum of its digits is equal to the product of its digits.

   Explanation:  
   The sum of the digits and the product of the digits are calculated, and the two values are compared.

   Example:  
   Input: `1124`  
   Output: `1124 is a spy number`  
   (1 + 1 + 2 + 4 = 8, 1 × 1 × 2 × 4 = 8)
 */
package com.numberSystem;

import java.util.Scanner;

public class SpyNumber 
{
	public static void isSM(int n)
	{
		int sum=0;
		int rem=0;
		int p=1;
		for(int i=n;i!=0;i/=10)
		{
			rem=i%10;
			sum+=rem;
			p*=rem;
		}
		if(sum==p)
		{
			System.out.println(n+" is a spy number");
		}
		else
		{
			System.out.println(n+" is a not spy number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Given number: ");
		int n=sc.nextInt();
		System.out.println("----------------------");
		isSM(n);
	}
}
