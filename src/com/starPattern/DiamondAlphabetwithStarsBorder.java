/*
 * Input: 5
Output:
    *    
   A B   
  * * *  
 C D E F 
* * * * * 
 C D E F 
  * * *  
   A B   
    *    

 */
package com.starPattern;

public class DiamondAlphabetwithStarsBorder 
{
	public static void isTwo(int n)
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
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print((char)ascii+++" ");
				}
			}
			System.out.println();
		}
		ascii=67;
		 for(int i = n - 1; i >= 1; i--)
	     {
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print((char)ascii+++" ");
				}
			}
			ascii=65;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isTwo(n);
	}
}

