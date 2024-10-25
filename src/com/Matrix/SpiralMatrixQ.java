package com.Matrix;

public class SpiralMatrixQ 
{
	public static void isSM(int a[][])
	{
		int left=0,top=0;
		int right=a.length-1,bottom=a.length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		isSM(a);
	}
}
