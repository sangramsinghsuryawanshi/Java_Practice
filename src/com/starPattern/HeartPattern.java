/*
  ***     ***
 *****   *****
 ****** ******
  ***********
   *********
    *******
     *****
      ***
       *

 */

package com.starPattern;

public class HeartPattern 
{
	public static void isHeart(int n)
	{
		for(int i=3;i<=n;i+=2)
		{
			for(int j=n;j>=i;j-=2)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=n;l>=i;l--)
			{
				if(l%2!=0)
				{
					System.out.print("  ");
				}
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=7;
		isHeart(n);
	}
}
