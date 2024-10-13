/*
 * 9. Pronic (Rectangular) Number  
   Write a Java program to check if a given number is a Pronic Number. A pronic number is a number that is the product of two consecutive integers.

   Explanation:  
   The number is checked to see if it can be expressed as the product of two consecutive integers.

   Example:  
   Input: `12`  
   Output: `12 is a pronic number`  
   (12 = 3 × 4)
 */
package com.numberSystem;

import java.util.Scanner;

public class PronicNumber 
{
	public static void isPM(int n)
	{
		int p=1;
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			p=i*(i+1);
			if(n==p)
			{
				cnt=1;
				break;
			}
		}
		if(cnt==1)
		{
			System.out.println(n+" is a pronic number");
		}
		else
		{
			System.out.println(n+" is a not pronic number");
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
