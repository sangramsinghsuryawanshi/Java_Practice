/*
 * 13. Longest Consecutive Sequence 
    Write a method to find the longest consecutive sequence of integers in an unsorted array.  
    Example:  
    Input: `[100, 4, 200, 1, 3, 2]`  
    Output: `4` (sequence: `1, 2, 3, 4`)
 */
package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConjicutive 
{
	
	public static void isPI(int a[])
	{
		List<Integer> l = new ArrayList<>();
		if(a[0]<a[1])
		{
			l.add(a[0]);
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[j]-a[i];
				if(sum==1)
				{
					l.add(a[j]);
				}
			}
		}
		System.out.println(l+" "+l.size());
	}
	public static void main(String[] args) 
	{
		int a[]= {100, 4, 200, 1, 3, 2};
		Arrays.sort(a);
		isPI(a);
	}
}