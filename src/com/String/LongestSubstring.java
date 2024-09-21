package com.String;

public class LongestSubstring 
{
	public static String isLong(String str)
	{
		String sub="";
		int len=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				sub=str.substring(i, j+1);
				StringBuilder sb = new StringBuilder(sub);
				sb.reverse();
				if(sb.toString().equals(sub))
				{
					if(sub.length()>len)
					{
						len=sub.length();
					}
				}
			}
		}
		return len+"";
	}
	public static void main(String[] args) 
	{
		String str="forgeeksskeegfor";
		System.out.println(isLong(str));
	}
}
