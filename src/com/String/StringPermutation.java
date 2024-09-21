package com.String;

public class StringPermutation 
{
	public static void isPer(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.print(per+" ");
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String  newChar=str.subSequence(0, i)+str.substring(i+1);
			isPer(newChar, per+ch);
		}
	}
	public static void main(String[] args) 
	{
		String str="ABC";
		isPer(str, "");
	}
}
