package com.starPattern;

public class MixPattern1 
{
	public static void isOne(int n,int ascii)
	{
		int a=66;
		int as=70;
		int asc=66;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1)
				{
					System.out.print((char)ascii+" ");
				}
				else if(i==1 && j>=2 && j<=n)
				{
					System.out.print((char)a+++" ");
				}
				else if(i==n && j>=2 && j<=n)
				{
					System.out.print((char)as+++" ");
				}
				else if(j==n && i>=2 && i<n)
				{
					System.out.print((char)asc+++" ");
				}
				else if((i+j)==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			ascii++;
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
