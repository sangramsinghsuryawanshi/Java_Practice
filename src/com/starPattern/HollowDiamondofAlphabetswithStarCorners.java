/*
 * Input: 5
Output:
    A    
   * *   
  B   B  
 *     * 
C       C
 *     * 
  B   B  
   * *   
    A    
 */
package com.starPattern;

public class HollowDiamondofAlphabetswithStarCorners 
{
	public static void isThree(int n)
	{
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1 || k==i)
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
					System.out.print("  ");
				}
				
			}
			if(i%2!=0)
			ascii++;
			System.out.println();
		}
		ascii=66;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				if(k==n || k==i)
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
					System.out.print("  ");
				}
				
			}
			if(i%2!=0) {
				ascii++;
				ascii=65;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isThree(n);
	}
}
