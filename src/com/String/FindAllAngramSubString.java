/*
 * 4. Find All Anagrams of a Substring  
   Given a string `s` and a string `p`, return the start indices of `p`'s anagrams in `s`.  
   Example: `s = "cbaebabacd"`, `p = "abc"` → Output: `[0, 6]`
 */
package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAngramSubString
{
	public static void isFAAS(String s,String s1)
	{
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			String s2="";
			for(int j=i;j<s.length();j++)
			{
				s2=s.substring(i, j+1);
				if(isTrueFales(s2,s1))
				{
					l.add(i);
				}
			}
		}
		System.out.println(l);
	}
	public static boolean isTrueFales(String s1,String s2)
	{
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		Arrays.sort(ch);
		return Arrays.equals(ch, ch1);
	}
	public static void main(String[] args) 
	{
		String s = "cbaebabacd";
		String s1 = "abc";
		System.out.println("Given Strings is: "+s+", "+s1);
		isFAAS(s,s1);
	}
}
