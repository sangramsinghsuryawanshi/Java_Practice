/*
 * 3. Longest Substring Without Repeating Characters
Problem: Find the length of the longest substring without repeating characters.
Input: "abcabcbb"
Output: 3 (The substring is "abc")
 */
package com.String;

public class LongestSubstringNonRepeating 
{
	public static int isSub(String str)
	{
		int cnt=0;
		String se="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				String s=str.substring(i, j+1);
				int c=0;
				for(int k=0;k<s.length();k++)
				{
					for(int l=k+1;l<s.length();l++)
					{
						if(s.charAt(k)==s.charAt(l))
						{
							c++;
						}
					}
				}
				if(c==0)
				{
					if(s.length()>cnt)
					{
						cnt=s.length();
						se=s;
					}
				}
			}
		}
		System.out.println(se);
		return cnt;
	}
	public static void main(String[] args) 
	{
		String str="dvdf";
		System.out.println(isSub(str));
	}
}
