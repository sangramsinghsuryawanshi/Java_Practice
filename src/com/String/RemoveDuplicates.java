/*
 * Remove Duplicates from a String

Input: "programming"
Output: "progamin"
 */
package com.String;

public class RemoveDuplicates 
{
	public static String isReDupli(String str)
	{
		char ch[]=str.toCharArray();
		String ch1=" ";
		int x=0;
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
			if(ch[i]!='0')
			{
				ch1+=ch[i];
				x++;
			}
		}
		return ch1;
		
	}
	public static void main(String[] args) 
	{
		String str = "programming";
		System.out.println(isReDupli(str));
	}
}
