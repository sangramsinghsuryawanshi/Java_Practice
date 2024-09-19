/*
 * Check if a String Contains Only Digits

Input: "12345"
Output: true
Input: "123a5"
Output: false
 */
package com.String;

public class ContainsDigitsOnly 
{
	public static String isDigits(String str)
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				cnt=1;
				break;
			}
		}
		if(cnt==0)
		{
			return "true";
		}
		else
		{
			return "false";
		}
		
	}
	public static void main(String[] args) 
	{
		String str = "12345";
		System.out.println(isDigits(str));
	}
}
