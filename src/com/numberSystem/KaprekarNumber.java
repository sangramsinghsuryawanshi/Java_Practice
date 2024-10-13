/*
 * 10. Kaprekar Number  
    Write a Java program to check if a given number is a Kaprekar Number. A Kaprekar number is a number whose square can be split into two parts that add up to the original number.

   Explanation:  
   The square of the number is calculated, and the resulting value is split into two parts. If the sum of these two parts equals the original number, it is a Kaprekar number.

   Example:  
   Input: `45`  
   Output: `45 is a Kaprekar number`  
   (45² = 2025, 20 + 25 = 45)
 */
package com.numberSystem;

import java.util.Scanner;

public class KaprekarNumber 
{
	public static void isPM(int n)
	{
		int rem=0;
		int sq=n*n;
		String spli=Integer.toString(sq);
		String f=spli.substring(0, spli.length()/2);
		String s=spli.substring(spli.length()/2, spli.length());
		int total=Integer.parseInt(s)+Integer.parseInt(f);
		if(total==n)
		{
			System.out.println(n+" is a Kaprekar number");
		}
		else
		{
			System.out.println(n+" is a not Kaprekar number");
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
