/*
 * 12. Strong Number  
    Write a Java program to check if a given number is a Strong Number. A strong number is a number where the sum of the factorials of its digits equals the number itself.

   Explanation:  
   The factorial of each digit is calculated, and the sum of these values is compared with the original number.

   Example:  
   Input: `145`  
   Output: `145 is a strong number`  
   (1! + 4! + 5! = 145)
 */
package com.numberSystem;

import java.util.Scanner;

public class StrongNumber 
{
	public static void isPM(int n)
	{
		int sum=0,t=n,rem=0;
		while(t!=0)
		{
			rem=t%10;
			int f=1;
			for(int i=1;i<=rem;i++)
			{
				f*=i;
			}
			sum+=f;
			t/=10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a strong number");
		}
		else
		{
			System.out.println(n+" is a not strong number");
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
