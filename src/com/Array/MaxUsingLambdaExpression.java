package com.Array;

interface Max
{
	int max(int a[]);
}
public class MaxUsingLambdaExpression 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		Max m = (a1)->{
			int max=Integer.MIN_VALUE;
			for(int c:a1)
			{
				if(c>max)
				{
					max=c;
				}
			}
			return max;
		};
		
		System.out.println(m.max(a));
	}
}
