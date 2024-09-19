package com.starPattern;

public class SquareAlphabatic 
{
	public static void isEight(int n)
	{
		int ascii=65;
		int asci=68;
		int asc=66;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(i==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(i==n)
				{
					System.out.print((char)asci+" ");
					asci--;
				}
				else if(j==n && i>=2 && i<n)
				{
					System.out.print((char)asc+++" ");
				}
				else if(i==j || (i+j)==n+1)
				{
					System.out.print("A ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			if(i==1)
			{
				ascii=66;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isEight(n);
	}
}
