package com.String;

import java.util.Stack;

public class BalancedBrackets 
{
	public static boolean isTrue(String str)
	{
		char ch[]=str.toCharArray();
		Stack<Character> s = new Stack<>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{' || ch[i]=='[' || ch[i]=='(' )
			{
				s.add(ch[i]);
			}
			else
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					char top=s.pop();
					if(ch[i]=='}' && top!='{' || ch[i]==']' && top!='[' || ch[i]==')' && top!='(' )
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String str="{{}}";
		if(isTrue(str))
		{
			System.out.println("true"+str+"");
		}
		else
		{
			System.out.println("false");
		}
	}
}
