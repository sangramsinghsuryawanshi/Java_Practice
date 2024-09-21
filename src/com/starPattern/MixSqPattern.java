package com.starPattern;

public class MixSqPattern 
{
	public static void isEleven(int n)
	{
		int ascii=65;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j>=2 && j<=5 || i==2 && j>=2 && j<=4 || i==3 && j>=2 && j<=3 || i==3 && j>=5 && j<=6 || i==4 && j==2 || i==4 && j>=4 && j<=6)
				{
					System.out.print("x ");
				}
				else if(i==2 && j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print((char)ascii+" ");
				}
			}
			ascii++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=6;
		isEleven(n);
	}
}
