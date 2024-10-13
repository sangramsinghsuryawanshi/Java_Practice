package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;

interface EvenFi
{
	void EF(int a[]);
}
public class FilterEven 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		EvenFi f=(a1)->{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]%2==0)
				{
					System.out.print(a1[i]+" ");
				}
			}
		};
		f.EF(a);
		List<Integer>li = Arrays.asList(1,2,3,4,5,6);
		List<Integer> ln = li.stream().filter((i)->(i%2)==0).toList();
		System.out.println(ln);
	}
}
