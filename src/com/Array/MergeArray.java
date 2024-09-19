/*
 * 1.write a program merge three array.
     input:
     int a[]={10,20,30,40,50};
     int b[]={1,2,3,4,5};
     int c[]={1,2,3,4,5};
     
     output:[10, 5, 1, 20, 4, 2, 30, 3, 3, 40, 2, 4, 50, 1, 5]
 */
package com.Array;

import java.util.Arrays;

public class MergeArray 
{
	public static int[] isMerged(int a[],int b[],int c[])
	{
		int x=0,y=b.length-1,z=0,index=0;
		int d[]=new int[a.length+b.length+c.length];
		for(int i=0;i<d.length;i++)
		{
			if(x<a.length)
			{
				d[index++]=a[x++];
			}
			if(y>=0)
			{
				d[index++]=b[y--];
			}
			if(z<c.length)
			{
				d[index++]=c[z++];
			}
		}
		return d;
	}
	public static void main(String[] args) 
	{
		  int a[]={10,20,30,40,50};
		  int b[]={1,2,3,4,5};
		  int c[]={1,2,3,4,5};
		  System.out.println(Arrays.toString(isMerged(a, b, c)));
	}
}
