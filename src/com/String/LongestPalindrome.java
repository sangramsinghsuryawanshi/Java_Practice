/*
 * 4. Find the Longest Palindrome in a String
Input: "babad"
Output: "bab" or "aba" (both are correct)
 */
package com.String;

public class LongestPalindrome 
{
	public static void isLP(String s)
	{
		String d="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				StringBuffer sb = new StringBuffer();
				String s1=s.substring(i,j+1);
				sb.append(s1);
				sb.reverse();
				if(sb.toString().equals(s1))
				{
					if(s1.length()>max)
					{
						max=s1.length();
						d=s1;
					}
				}
			}
		}
		System.out.println(max+" "+d);
	}
	public static void main(String[] args) 
	{
		String s="babad";
		isLP(s);
	}
}
