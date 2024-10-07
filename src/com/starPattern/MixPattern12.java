package com.starPattern;

public class MixPattern12 
{
	public static void isPa(int n)
	{
		int ascii=65;
		int as=65;
		int asc=66;
		int asc1=66;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(i==n)
				{
					System.out.print((char)as+++" ");
				}
				else if(j==1 && i>=2 && i<n || j==n && i>=2 && i<n)
				{
					System.out.print(ch+" ");
				}
				else if(i==3 && j>=3 && j<=5)
				{
					System.out.print((char)asc+++" ");
				}
				else if(i==5 && j>=3 && j<=5)
				{
					System.out.print((char)asc1+++" ");
				}
				else if(i==4 && j==3)
				{
					System.out.print("B ");
				}
				else if(i==4 && j==5)
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
		int n=7;
		isPa(n);
	}
}
