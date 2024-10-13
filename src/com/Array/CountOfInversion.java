/*
 * 10. Count Inversions in an Array
Input:
Array: [2, 4, 1, 3, 5]
Output: 3 (Inversions: (2, 1), (4, 1), (4, 3))
 */
package com.Array;

public class CountOfInversion 
{
	public static void isCOI(int a[])
	{
		int cnt=0;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					sb.append("("+a[i]+",");
					sb.append(a[j]+")");
					cnt++;
				}
			}
		}
		System.out.println(cnt+" "+sb);
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 4, 1, 3, 5};
		isCOI(a);
	}
}
