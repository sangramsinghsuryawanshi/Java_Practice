/*
 * 12. Array Partition Problem  
    Given an integer array `nums` of `2n` integers, group these integers into `n` pairs such that the sum of the minimum of each pair is maximized.  
    Example:  
    Input: `[1,4,3,2]`  
    Output: `4` (because 1+3 is the maximum sum)
 */
package com.Array;

import java.util.Arrays;

public class PartitionProblem 
{
	public static void isPI(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i+=2)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int a[]= {1,4,3,2};
		Arrays.sort(a);
		isPI(a);
	}
}