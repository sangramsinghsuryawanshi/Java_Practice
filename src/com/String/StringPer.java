package com.String;

public class StringPer 
{
	public static void isPer(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.print(per+" ");
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				String newCh=str.substring(0,i)+str.substring(i+1);
				isPer(newCh, per+ch);
			}
		}
	}
	public static void main(String[] args) {
		String str="ABC";
		isPer(str, "");
	}
}
