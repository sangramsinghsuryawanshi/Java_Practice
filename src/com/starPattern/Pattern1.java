package com.starPattern;

public class Pattern1 
{
	public static void isT(int n)
	{
		int ascii=79;
		int c=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(i==1 && j==5 || i==2 && j==3)
				{
					System.out.print("B ");
				}
				else if(i==4 && j==2 || i==5 && j==3)
				{
					System.out.print("C ");
				}
				else if(i==2 && j==4 || i==2 && j==6)
				{
					System.out.print("Q ");
				}
				else if(j==2 && i>=2 && i<=3 || j==3 && i==4)
				{
					System.out.print(c+++" ");
				}
				else if(i==1 && j==2)
				{
					System.out.print("A ");
				}
				else if(i==1 && j==6)
				{
					System.out.print("D ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=6;
		isT(n);
	}
}
