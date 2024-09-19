/*
 * 4. Very Hard: Subarray with Given Sum
Problem: Write a Java program to find a continuous subarray in an array that sums up to a given target sum.

Input:

int[] arr = {1, 4, 20, 3, 10, 5};
int target = 33;
Output:

Subarray found from index 2 to 4
 */
package com.Array;

public class SubArrayWithGivenSum 
{
	public static String isFound(int a[],int t)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==t)
					{
						return "Subarray found from index "+i+" to "+k;
					}
				}
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		int a[]={1, 4, 20, 3, 10, 5};
		int target = 33;
		System.out.println(isFound(a, target));
	}
}
