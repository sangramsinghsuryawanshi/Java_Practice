package com.starPattern;

public class Pattern 
{
	public static void isP(int n)
	{
		int ascii=65,cnt=1,as=65,c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j==1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(j==11)
				{
					System.out.print((char)as+++" ");
				}
				else if(j==2)
				{
					System.out.print(cnt+++" ");
				}
				else if(j==10)
				{
					System.out.print(c+++" ");
				}
				else if(i==1 || j==3 || j==9 || i==n)
				{
					System.out.print("* ");
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
		int n=5;
		isP(n);
	}
}
