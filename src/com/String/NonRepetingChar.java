/*
 * 1. Find the First Non-Repeated Character in a String
Input: "swiss"
Output: 'w'
 */
package com.String;

public class NonRepetingChar 
{
	public static void isNRS(String s)
	{
		char ch[]=s.toCharArray();
		int n=0;
		char c=' ';
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(cnt==0 && ch[i]!=' ' && ch[i]!='0')
			{
				c=ch[i];
				break;
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		String s="swiss";
		isNRS(s);
	}
}
