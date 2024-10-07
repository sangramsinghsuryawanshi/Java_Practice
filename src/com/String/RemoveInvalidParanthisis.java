/*
 * 5. Remove Invalid Parentheses  
   Write a Java method that removes the minimum number of invalid parentheses to make the input valid.  
   Example:  
   Input: `"(a)())()"`  
   Output: `"(a)()()"`
 */
package com.String;
import java.util.Stack;

public class RemoveInvalidParanthisis 
{
	public static void isREinPa(String s)
	{
		StringBuffer sb = new StringBuffer();
		boolean b = false;
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			if(b)continue;
			String s1="";
			for(int j=i;j<s.length();j++)
			{
				s1=s.substring(i, j+1);
				if(isValid(s1))
				{
					cnt++;
					sb.append(s1);
					b=true;
				}
			}
		}
		System.out.println(sb);
	}
	public static boolean isValid(String s1)
	{
		char ch[]=s1.toCharArray();
		Stack<Character> s = new Stack<>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{' || ch[i]=='[' || ch[i]=='(')
			{
				s.add(ch[i]);
			}
			else if(ch[i]==')')
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					char top=s.pop();
					if((ch[i]=='}' && top!='{') || (ch[i]==']' && top!='[') || (ch[i]==')' && top!='(') )
					{
						return false;
					}
				}
			}
		}
		return s.isEmpty();
	}
	public static void main(String[] args) 
	{
		String s="(a)())()";
		isREinPa(s);
	}
}
