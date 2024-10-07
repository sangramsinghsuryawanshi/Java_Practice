package com.String;

public class RemovingDuplicatesCnt 
{
	public static int isRemoved(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		int cnt=0;
		for(int i=0;i<sb.length();i++)
		{
			
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					cnt++;
					j--;
					
				}
			}
		}
		System.out.println(sb);
		return cnt;
	}
	public static void main(String[] args) 
	{
		String str="cbacdcbc";
		System.out.println(isRemoved(str));
	}
}
