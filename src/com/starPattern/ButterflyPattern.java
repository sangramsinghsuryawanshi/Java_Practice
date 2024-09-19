/*

*       *
**     **
* *   * *
*  * *  *
*   *   *
*   *   *
*  * *  *
* *   * *
**     **
*       *

 */
package com.starPattern;

public class ButterflyPattern 
{
	public static void isButterfly(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)
			{
				if(l==1 || l==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if(j==n || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int l=n;l>=i;l--)
			{
				if(l==n || l==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		isButterfly(n);
	}
}
