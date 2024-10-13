/*
 * 
14. Smith Number  
    Write a Java program to check if a given number is a Smith Number. A Smith number is a composite number whose sum of digits is equal to the sum of the digits of its prime factors.

   Explanation:  
   The prime factors of the number are calculated, and the sum of their digits is compared with the sum of the digits of the original number.

   Example:  
   Input: `666`  
   Output: `666 is a Smith number`  
   (Prime factors of 666 = 2, 3, 3, 37 → 6 + 6 + 6 = 18, 2 + 3 + 3 + 3 + 7 = 18)
 */
package com.numberSystem;

import java.util.Scanner;

public class SmithNumber 
{
	public static void isPM(int n)
	{
		String s="";
		for(int i=1;i<=3;i++)
		{
			s+=n*i;
		}
		int cnt=0;
		for(char c:s.toCharArray())
		{
			if(c<='1' || c<='9')
			{
				cnt++;
			}
		}
		if(cnt==9)
		{
			System.out.println(n+" is a fascinating number");
		}
		else
		{
			System.out.println(n+" is a not fascinating number");
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
