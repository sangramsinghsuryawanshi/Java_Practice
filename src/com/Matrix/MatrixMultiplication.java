package com.Matrix;

public class MatrixMultiplication 
{
	public static void isMul(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<b[i].length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		isMul(a,b);
	}
}