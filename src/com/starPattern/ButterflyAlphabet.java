/*
 * Input: 4
Output:
A       A
B *   * B
C * * * C
* * * * *
C * * * C
B *   * B
A       A

 */
package com.starPattern;

public class ButterflyAlphabet 
{
	public static void isSeventh(int n) 
	{
		int ascii=65;
		int asci=65;
		int asc=67;
		int as=67;
		for(int i=1;i<=n+2;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i>=1 && i<n-1)
				{
					System.out.print((char)ascii+++" ");
				}
				else if(j==n && i>=1 && i<n-1) 
				{
					System.out.print((char)asci+++" ");
				}
				else if(j==n-2 && i>=3 && i<=n || i==n-1 ||j==n-1 && i>=2 && i<=n+1 || j==2 && i>=2 && i<=n+1) 
				{
					System.out.print("* ");
				}
				else if(j==1 && i>=n && i<=n+3) 
				{
					System.out.print((char)asc--+" ");
				}
				else if(j==n && i>=n && i<=n+3) 
				{
					System.out.print((char)as--+" ");
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
		isSeventh(n);
	}
}
