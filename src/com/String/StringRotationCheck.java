/*
 * 3. String Rotation Check  
   Write a Java method to check if one string is a rotation 
   of another string. For example, `"waterbottle"` is a 
   rotation of `"erbottlewat"`.
 */
package com.String;

import java.util.Arrays;

public class StringRotationCheck 
{
	public static void isSRC(String s1,String s)
	{
		char ch[]=s1.toCharArray();
		char ch1[]=s.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		s1=new String(ch);
		s=new String(ch1);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		if(s1.equals(s))
		{
			System.out.println("one string is a rotation of another string");
		}
		else
		{
			System.out.println("one string is a not rotation of another string");
		}
	}
	public static void main(String[] args) 
	{
		String s1="waterbottle";
		String s="erbottlewat";
		isSRC(s1, s);
	}
}
