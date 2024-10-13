package com.LambdaExpression;
interface A
{
	void methodOne();
	default void defMet()
	{
		System.out.println("Default Method one");
	}
}
interface B
{
	void methodTwo();
	default void defMetTwo()
	{
		System.out.println("Default Method Two");
	}
}
public class MultipleInheriUsingInterface implements A,B
{
	public void methodOne()
	{
		System.out.println("Method A implementation");
	}
	public void methodTwo()
	{
		 System.out.println("Method B implementation");
	}
	public void defMet()
	{
		A.super.defMet();
	}
	public static void main(String[] args) 
	{
		MultipleInheriUsingInterface MIUI=new MultipleInheriUsingInterface();
		MIUI.defMet();
		MIUI.defMetTwo();
		MIUI.methodOne();
		MIUI.methodTwo();
	}
}
