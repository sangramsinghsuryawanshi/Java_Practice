/*
 * 
6. Harshad (Niven) Number  
   Write a Java program to check if a given number is a Harshad or Niven Number. A Harshad number is an integer that is divisible by the sum of its digits.

   Explanation:  
   The sum of the digits of the number is calculated, and the original number is checked for divisibility by this sum.

   Example:  
   Input: `18`  
   Output: `18 is a Harshad number`  
   (1 + 8 = 9, 18 ÷ 9 = 2)

 */
package com.numberSystem;

import java.util.Scanner;

public class HarshadNum 
{
	public static void isPM(int n)
	{
		int sum=0;
		int rem=0;
		for(int i=n;i!=0;i/=10)
		{
			rem=i%10;
			sum+=rem;
		}
		if(n%sum==0)
		{
			System.out.println(n+" is a Harshad number");
		}
		else
		{
			System.out.println(n+" is a not Harshad number");
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
