package com.String;

import java.util.Stack;

public class DeleteConjicutive 
{
	public static int isConjicutive(String str)
	{
		String s1[]=str.split(" ");
		Stack<String> s = new Stack<>();
		s.add(s1[0]);
		try
		{
			for(int i=1;i<s1.length;i++)
			{
				if(s.peek().equals(s1[i]))
				{
					s.pop();
				}
				else
				{
					s.push(s1[i]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(s);
		return s.size();
	}
	public static void main(String[] args) 
	{
		String str="adlajfbdjl";
		System.out.println(isConjicutive(str));
	}
}
