/*
 * 

* 1 * A B C
1 * 2 D E F
G H I * * *
3 4 5 J * K

 */
package com.starPattern;

public class MixPattern 
{
	public static void isP(int n)
	{
		int ascii=65;
		int cnt=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i==1 && j>=4 && j<=6) || (i==2 && j>=4 && j<=6) || (i==3 && j>=1 && j<=3) || (i==4 && j==4)||(i==4 && j==6))
				{
					System.out.print((char)ascii+++" ");
				}
				else if((i==2 && j==1)|| (i==2 && j==3) || (i==4 && j>=1 && j<=3))
				{
					System.out.print(cnt+++" ");
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
		int n=4;
		isP(n);
	}
}
