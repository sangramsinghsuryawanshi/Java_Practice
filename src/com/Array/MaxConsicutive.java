/*
 * 10. Max Consecutive Ones 
    Given a binary array, find the maximum number of consecutive `1`s in the array.  
    Example:  
    Input: `[1,1,0,1,1,1]`  
    Output: `3`
 */
package com.Array;

public class MaxConsicutive
{
	public static void isPI(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
				else
				{
					break;
				}
			}
			if(cnt>max)
			{
				max=cnt;
			}
		}
		System.out.print(max+" ");
	}
	public static void main(String[] args) 
	{
		int a[]= {1,1,0,1,1,1};
		isPI(a);
	}
}
