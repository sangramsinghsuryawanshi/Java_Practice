/*
 * Reverse a String: Write a recursive function to reverse a given string.

Input: "hello"
Output: "olleh"
 */
package com.Recursion;

public class ReverseString 
{
	static int l;
	public ReverseString(int n) 
	{
		ReverseString.l=n;
	}
	public static void isRev(String str)
	{
		if(l>0)
		{
			System.out.println(str.charAt(--l));
			isRev(str);
		}
	}
	public static void main(String[] args) 
	{
		String str="hello";
		int n=str.length();
		ReverseString r = new ReverseString(n);
		isRev(str);
	}
}
