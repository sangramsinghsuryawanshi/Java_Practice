package com.Array;

public class LongestIncresingSubsequence 
{
	public static void isLIS(int a[])
	{
		StringBuffer sb = new StringBuffer();
		boolean b[]=new boolean[sb.length()];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1] || a[i]>a[i+1])
			{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		int a[]= {0, 1, 0, 3, 2, 3};
		isLIS(a);
	}
}
