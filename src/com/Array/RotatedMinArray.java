/*
 * Find Minimum in Rotated Sorted Array:

Problem: Given a rotated sorted array (an array that was initially sorted and then rotated), find the minimum element. The array does not contain duplicates.
Input: int[] arr = {4, 5, 6, 7, 0, 1, 2};
Output: Minimum element is 0
Hint: Use binary search for an O(log n) solution.
 */
package com.Array;

public class RotatedMinArray 
{
	public static int isMin(int a[])
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-1;
				}
			}
			if(cnt==0 && a[i]<min && a[i]!=-1)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int[] arr = {4, 5, 6, 7, 0, 0, 1, 2};
		System.out.println(isMin(arr));
	}
}
