/*
 * 
1. Find the Missing Number in an Array  
   Given an array containing `n` distinct numbers taken from `0, 1, 2, ..., n`, find the missing number.  
   Example:  
   Input: `[3, 0, 1]`  
   Output: `2`
 */
package com.Array;

public class FrindMissingNum 
{
	public static void isFMN(int a[])
	{
		int f=a[0],l=a[a.length-1],len=a.length,sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int fi=len*(f+l)/2;
		System.out.println(fi-sum);
	}
	public static void main(String[] args) 
	{
		int a[]= {3,0,1};
		isFMN(a);
	}
}
