/*
 * 14. 3Sum Problem  
    Given an array, find all unique triplets in the array which give the sum of zero.  
    Example:  
    Input: `[-1, 0, 1, 2, -1, -4]`  
    Output: `[[-1, 0, 1], [-1, -1, 2]]`
 */
package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem 
{
	public static void isFMN(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=-1;
				List<Integer> ll = new ArrayList<>();
				for(int k=j+1;k<a.length;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==0)
					{
						ll.add(a[i]);
					}
				}
				System.out.println(ll);
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {-1, 0, 1, 2, -1, -4};
		System.out.println("Element: "+Arrays.toString(a));
		isFMN(a);
	}
}
