package com.String;

public class StringPermutationFind 
{
	public static void isSP(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.print(per+" ");
			return;
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				String newChar=str.substring(0, i)+str.substring(i+1);
				isSP(newChar, per+ch);
			}
		}
	}
	public static void main(String[] args) 
	{
		String s="ABC";
		isSP(s, "");
	}
}
