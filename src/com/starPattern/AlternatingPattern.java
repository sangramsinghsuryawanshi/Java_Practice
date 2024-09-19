/*
 * Input: 5
Output:
E E E E E
 * * * *
D D D D
 * * *
C C C
 * *
B B
 *
B B
 * *
C C C
 * * *
D D D D
 * * * *
E E E E E

 */
package com.starPattern;

public class AlternatingPattern 
{
	public static void isTen(int n)
	{
		int ascii=70;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print((char)ascii+" ");
				}
			}
			if(i%2==0)
			{
				ascii--;
			}
			System.out.println();
		}
		ascii=66;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print((char)ascii+" ");
				}
			}
			if(i%2==0)
			{
				ascii++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=8;
		isTen(n);
	}
}
