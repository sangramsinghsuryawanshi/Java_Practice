/*
 * 8. Subarray Sum Equals K  
    Write a Java function to find the total number of continuous subarrays whose sum equals `k`.  
    Example:  
    Input: `nums = [1,1,1]`, `k = 2`  
    Output: `2`
 */
package com.Array;

public class SubArrayEqualsSum 
{
	public static void isSAS(int a[],int k)
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				for(int l=i;l<=j;l++)
				{
					sum+=a[l];
				}
				if(sum==k)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		int a[]= {1,1,1};
		int k=2;
		isSAS(a, k);
	}
}
