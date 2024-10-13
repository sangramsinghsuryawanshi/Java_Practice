/*
 * 12. Find the k Most Frequent Elements in an Array
Input:
Array: [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
 */
package com.Array;

import java.util.HashSet;
import java.util.Set;

public class KthMostRepeatedEle 
{
	public static void isKMRE(int a[])
	{
		int k=2;
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==k)
			{
				s.add(a[i]);
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 1, 1, 2, 2, 3};
		isKMRE(a);
	}
}
