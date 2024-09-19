/*
 * Find All Unique Triplets with Sum Zero:

Problem: Given an array of integers, find all unique triplets that sum to zero.
Input: int[] arr = {-1, 0, 1, 2, -1, -4};
Output: Unique triplets are: [-1, -1, 2], [-1, 0, 1]
Hint: Sort the array and use two-pointer technique.
 */
package com.Array;

import java.util.Arrays;

public class TriplletSumZero 
{
	public static String isFound(int a[],int t)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				int cnt=1;
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==t && cnt==1)
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
						cnt++;
					}
				}
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		int a[]={-1, 0, 1, 2, -1, -4};
		int target = 0;
		System.out.println(isFound(a, target));
	}
}
