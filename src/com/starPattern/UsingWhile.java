package com.starPattern;

public class UsingWhile 
{
	public static void isOne(int n,int ascii)
	{
		int i=1;
		int a=66;
		int as=66;
		int asc=70;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				if(i==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(j==1 && i>=2 && i<=n)
				{
					System.out.print((char)a+++" ");
				}
				else if(j==n && i>=2 && i<n)
				{
					System.out.print((char)as+++" ");
				}
				else if(i==n && j>=2 && j<=n)
				{
					System.out.print((char)asc+++" ");
				}
				else if(i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				j++;
			}
			i++;
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		int n=5;
		int ascii=65;
		isOne(n, ascii);
	}
}
