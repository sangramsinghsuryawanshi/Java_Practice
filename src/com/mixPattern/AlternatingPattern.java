/*
 * 
A 1 B 2 C 3 D 4 E 5
A 1 B 2 C 3 D 4
A 1 B 2 C 3
A 1 B 2
A 1

 */
package com.mixPattern;

public class AlternatingPattern 
{
	public static void isAP(int n)
	{
		int cnt=1;
		int a=65;
		for(int i=1;i<=n;i++)
		{
			cnt=1;
			a=65;
			for(int j=n;j>=i;j--)
			{
				if(j%2!=0)
				{
					System.out.print(cnt+++" ");
				}
				else
				{
					System.out.print((char)a+++" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		isAP(n);
	}
}
