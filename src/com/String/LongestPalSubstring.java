/*
 * 
2. Longest Palindromic Substring  
   Implement a Java method to find the longest palindromic substring in a string. For example, for
    `"babad"`, the output should be `"bab"` or `"aba"`.
 */
package com.String;

public class LongestPalSubstring 
{
	public static void isLPS(String s)
	{
		String h="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			String s1="";
			for(int j=i;j<s.length();j++)
			{
				s1=s.substring(i, j+1);
				StringBuffer sb = new StringBuffer(s1);
				sb.reverse();
				if(sb.toString().equals(s1))
				{
					if(s1.length()>max)
					{
						max=s1.length();
						h=s1;
					}
				}
			}
		}
		System.out.println("Palindromic SubString is: "+h);
	}
	public static void main(String[] args) 
	{
		String s = "babad";
		System.out.println("Given String is: "+s);
		isLPS(s);
	}
}
