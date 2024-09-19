/*
 * Longest Subarray with Sum ≤ K:

Problem: Given an array of integers and a number K, find the length of the longest subarray with sum less than or equal to K.
Input: int[] arr = {1, 2, 3, 4, 5}; int K = 10;
Output: Length of longest subarray: 4
Hint: Use sliding window technique to solve in O(n).
 */
package com.Array;

public class LongestSubArraySum 
{
	public static int isLong(int a[],int t)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{  			
				int sum=0;
				int cnt=0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					cnt++;
					
				}
				if(sum==t)
				{
					if(cnt>max) 
					{
						max=cnt;
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1, 1,1, 2,1, 4, 5}; 
		int K = 10;
		System.out.println(isLong(arr, K));
	}
}
