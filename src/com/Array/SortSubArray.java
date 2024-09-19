/*
 * 1.Write a program sort sub-array in accending order.
	          input:
	          int [] a={9,1,3,5,6,11,22,66,10,19,11,12};
	          int target=4;	 
	          output:[1, 3, 9, 5, 6, 11, 10, 22, 66, 11, 12, 19];
	           or
	           Not sortable Array
 */
package com.Array;

public class SortSubArray
{
	public static void isOP(int a[],int t)
	{
		StringBuilder sb =  new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			if((i+(a.length/t))<=a.length)
			{
				for(int j=i;j<(i+(a.length/t));j++)
				{
					sb.append(a[j]).reverse();
				}
				System.out.println();
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		int [] a={9,1,3,5,6,11,22,66,10,19,11,12};
        int target=4;
        isOP(a, target);
	}
}
