/*
 * Input: 5
Output:
A       A
 *     * 
  B   B  
   * *   
    C    
   * *   
  B   B  
 *     * 
A       A

 */
package com.starPattern;

public class XShapedPattern 
{
	public static void isFive(int n)
	{
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n;k++)
			{
				if(i==k || (i+k)==n+1)
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
				else
				{
					System.out.print(" ");
				}
			}
			if(i%2!=0)
			{
				if(i<=4)
				{
					ascii++;
				}
				else
				{
					ascii--;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=9;
		isFive(n);
	}
}
