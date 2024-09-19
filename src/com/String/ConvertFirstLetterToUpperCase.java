/*
 * Convert the First Letter of Each Word to Uppercase

Input: "hello world"
Output: "Hello World"
 */
package com.String;

public class ConvertFirstLetterToUpperCase 
{
	public static String isConvert(String str)
	{
		String s=" ";
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			 s += s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1) + " ";
		}
		return s;
		
	}
	public static void main(String[] args) 
	{
		String str = "hello world";
		System.out.println(isConvert(str));
	}
}
