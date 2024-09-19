/*
 * Input: 6
Output:

F F F F F F
 * * * * *
E E E E E
 * * * *
D D D D
 * * *
C C C
 * *
B B
 *

 */
package com.starPattern;

public class InvertedPatterrn 
{
	public static void isSixth(int n)
	{
		int ascii=70;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if(i%2!=0)
				{
					System.out.print((char)ascii+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			if(i%2!=0)
			{
				ascii--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		isSixth(n);
	}
}
