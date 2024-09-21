/*
 * 8. Check if Two Strings are Rotation of Each Other
Problem: Determine if one string is a rotation of another.
Input: ("waterbottle", "erbottlewat")
Output: true
 */
package com.String;

import java.util.Arrays;

public class StringRotationOfEachOther 
{
	public static String isLong(String str,String s)
	{	
		char ch[]=str.toCharArray();
		char ch1[]=s.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		str = new String(ch);
		s = new String(ch1);
		if(str.equals(s))
		{
			System.out.println("true");
		}
		return "";
	}
	public static void main(String[] args) 
	{
		 String s1 = "waterbottle";
	     String s2 = "erbottlewat";
		System.out.println(isLong(s1,s2));
	}
}