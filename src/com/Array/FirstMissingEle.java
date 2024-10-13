/*
 * 7. Find the First Missing Positive  
   Given an unsorted array, find the smallest missing positive integer.  
   Example:  
   Input: `[3, 4, -1, 1]`  
   Output: `2`
 */
package com.Array;

import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingEle 
{
	public static void isFMN(int a[])
	{
		HashSet<Integer> h = new HashSet<>();
		for(int num:a)
		{
			if(num>0)
			h.add(num);
		}
		int sm=1;
		while(h.contains(sm))
		{
			sm++;
		}
		System.out.println(sm);
	}
	public static void main(String[] args) 
	{
		int a[]= {3, 4, -1, 1};
		System.out.println("Element: "+Arrays.toString(a));
		isFMN(a);
	}
}
