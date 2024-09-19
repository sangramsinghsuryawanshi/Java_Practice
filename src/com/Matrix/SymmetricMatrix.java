package com.Matrix;

public class SymmetricMatrix 
{
	public static String isDigonal(int a[][])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]!=a[j][i])
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
		int a[][]= {{1,2,3},{2,3,4},{3,4,5}};
		System.out.println(isDigonal(a));
	}
}
