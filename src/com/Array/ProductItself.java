/*
 * 9. Product of Array Except Self  
    Given an array `nums`, return an array `output` such that `output[i]` is equal to the product of all elements of `nums` except `nums[i]`.  
    Example:  
    Input: `[1,2,3,4]`  
    Output: `[24,12,8,6]`
 */
package com.Array;

public class ProductItself 
{
	public static void isPI(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int p=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					p*=a[j];
				}
			}
			System.out.print(p+" ");
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		isPI(a);
	}
}
