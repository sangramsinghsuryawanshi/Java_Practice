/*
 * 2. Find the Intersection of Two Arrays
Input:
arr1 = [1, 2, 2, 1]
arr2 = [2, 2]
Output: [2]
 */
package com.Array;

import java.util.HashSet;
import java.util.Set;

public class InsertionOfTwoArrays 
{
	public static void isIOTA(int a[],int b[])
	{
		Set<Integer>s=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					s.add(a[i]);
				}
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 2, 1};
		int b[]= {2, 2,1};
		isIOTA(a, b);
	}
}
