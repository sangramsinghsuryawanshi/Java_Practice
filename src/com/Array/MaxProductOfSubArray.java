/*
 * Find Maximum Product Subarray:

Problem: Given an integer array, find the subarray with the maximum product.
Input: int[] arr = {2, 3, -2, 4};
Output: Maximum product is 6 (subarray is {2, 3})
Hint: Keep track of both maximum and minimum products at each step to handle negative numbers.

 */
package com.Array;

public class MaxProductOfSubArray
{
	public static int isMaxPro(int a[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{  			
				int sum=1;
				for(int k=i;k<=j;k++)
				{
					sum*=a[k];
				}
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] arr = {2, 3, -2, 4};
		System.out.println(isMaxPro(arr));
	}
}
