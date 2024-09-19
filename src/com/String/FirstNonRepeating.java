/*
 * Find the First Non-Repeating Character

Input: "swiss"
Output: 'w'
 */
package com.String;

public class FirstNonRepeating 
{
	public static char isNonRe(String str)
	{
		char ch[]=str.toCharArray();
		char ch1=' ';
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
			if(cnt==0 && ch[i]!='0' && x==0)
			{
				ch1=ch[i];
				x++;
			}
		}
		return ch1;
		
	}
	public static void main(String[] args) 
	{
		String str = "propro";
		System.out.println(isNonRe(str));
	}
}
