package com.starPattern;

public class TriangleMixPattern 
{
	public static void isNine(int n)
	{
		int ascii=65;
		int a=67;
		for(int i=1;i<=n;i+=2)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					System.out.print(" ");
				}
				else if(j==1 || j==i)
				{
					System.out.print("* ");
				}
				else if(j==2 || i==n && j!=1 && j!=i )
				{
					System.out.print((char)ascii+++" ");
				}
				else if(j==i-1)
				{
					System.out.print((char)a+++" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=13;
		isNine(n);
	}
}
