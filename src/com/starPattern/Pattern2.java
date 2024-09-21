package com.starPattern;

public class Pattern2 
{
	public static void isP(int n)
	{
		int i=1;
		int ascii=65;
		int asci=66;
		while(i<n)
		{
			int j=1;
			while(j<=n)
			{
				if(i==1 || j==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(j==n && i>=1 && i<n-1)
				{
					System.out.print((char)asci+++" ");
				}
				else if(i==n-1)
				{
					System.out.print((char)asci+++" ");
				}
				else if((i+j)==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				j++;
			}
			if(i==1)
			{
				ascii=66;
			}
			i++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=6;
		isP(n);
	}
}
