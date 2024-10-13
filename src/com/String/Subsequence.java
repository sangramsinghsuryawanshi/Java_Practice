package com.String;

import java.util.ArrayList;
import java.util.List;

public class Subsequence 
{
	public static void isS(String s,String sub,List<String> ls)
	{
		if(s.isEmpty())
		{
			ls.add(sub);
			return;
		}
		isS(s.substring(1), sub, ls);
		isS(s.substring(1), sub+s.charAt(0), ls);
	}
	public static List<String> isPS(String s)
	{
		List<String> ls = new ArrayList<>();
		isS(s, "", ls);
		return ls;
	}
	public static void main(String[] args) 
	{
		String s="ABC";
		System.out.println(isPS(s));
	}
}
