/*
 * 11. Disarium Number  
    Write a Java program to check if a given number is a Disarium Number. A disarium number is a number where the sum of its digits powered with their respective positions is equal to the number itself.

   Explanation:  
   Each digit of the number is raised to the power of its position, and the sum of these values is compared to the original number.

   Example:  
   Input: `175`  
   Output: `175 is a disarium number`  
   (1¹ + 7² + 5³ = 175)
 */
package com.numberSystem;

import java.util.Scanner;

public class DisariumNumber 
{
	public static void isPM(int n)
	{
		int cnt=0,sum=0,t=n,rem=0;
		while(t!=0)
		{
			cnt++;
			t/=10;
		}
		t=n;
		while(t!=0)
		{
			rem=t%10;
			sum+=Math.pow(rem, cnt);
			cnt--;
			t/=10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a disarium number");
		}
		else
		{
			System.out.println(n+" is a not disarium number");
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
