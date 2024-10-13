/*
 * 13. Fascinating Number  
    Write a Java program to check if a given number is a Fascinating Number. A fascinating number is a number that when multiplied by 2 and 3 results in a concatenation of the digits from 1 to 9 exactly once.

   Explanation:  
   The number is multiplied by 2 and 3, and the results are concatenated. If the resulting string contains all digits from 1 to 9 exactly once, it is a fascinating number.

   Example:  
   Input: `192`  
   Output: `192 is a fascinating number`  
   (192 × 1 = 192, 192 × 2 = 384, 192 × 3 = 576 → concatenated = "192384576")
 */
package com.numberSystem;

import java.util.Scanner;

public class FascinatingNumber
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
