/*
 * 7. Longest Common Substring  
   Write a Java method to find the longest common substring between two strings.  
   Example:  
   Input: `"ABABC"`, `"BABCA"`  
   Output: `"BABC"`
 */
package com.String;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring 
{
	public static void isLCS(String s,String s1)
	{
		String t="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			String sub1="";
			for(int j=i;j<s.length();j++)
			{
				sub1=s.substring(i, j+1);
				if(s1.contains(sub1))
				{
					if(sub1.length()>max)
					{
						max=sub1.length();
						t=sub1;
						
					}
				}
			}
		}
		System.out.println("Common SubString is: "+t);
	}
	public static void main(String[] args) 
	{
		String s = "ABABC";
		String s1 = "BABCA";
		System.out.println("Given String is: "+s+","+s1);
		isLCS(s, s1);;
	}
}
