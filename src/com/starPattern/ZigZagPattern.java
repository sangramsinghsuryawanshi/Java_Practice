/*
 * Input: 5
Output:
    A    
   * B   
  C * D  
 * E * F 
G * H * I

 */
package com.starPattern;

public class ZigZagPattern 
{
	public static void isFour(int n)
	{
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			 for(int k = 1; k <= i; k++)
	            {
	                if(k % 2 == 1)
	                {
	                    System.out.print((char)ascii + " ");
	                    ascii++;
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
		int n=5;
		isFour(n);
	}
}
