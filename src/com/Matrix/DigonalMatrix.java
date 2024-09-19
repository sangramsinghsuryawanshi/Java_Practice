package com.Matrix;

public class DigonalMatrix 
{
	public static String isDigonal(int a[][])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=j && a[i][j]!=0)
				{
					c++;
					break;
				}
			}
		}
		if(c==0)
		{
			return "Digonal";
		}
		else
		{
			return "Not";
		}
	}
	public static void main(String[] args) 
	{
		int a[][]= {{3,3,0},{0,3,0},{0,0,1}};
		System.out.println(isDigonal(a));
	}
}
