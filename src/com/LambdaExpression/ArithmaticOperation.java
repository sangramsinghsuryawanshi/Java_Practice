package com.LambdaExpression;
interface Ar
{
	 void ariOper(int a,int b);
}
public class ArithmaticOperation 
{
	public static void main(String[] args) 
	{
		Ar a1 = (a,b)->{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		};
		a1.ariOper(6, 3);
	}
}
