/*
 * 27. Group Anagrams: Write a program to group a list of
 *  strings into anagrams using `HashMap`.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupOfAnagram {
	public static void isGOA(String s)
	{
		String str[]=s.split(" ");
		boolean[] b = new boolean[str.length];
		List<List<String>> ls = new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			if(b[i])
			{
				continue;
			}
			List<String>l=new ArrayList<>();
			l.add(str[i]);
			for(int j=i+1;j<str.length;j++)
			{
				if(isAn(str[i], str[j]))
				{
					l.add(str[j]);
					b[j]=true;
				}
			}
			ls.add(l);
		}
		System.out.println(ls);
	}
	public static boolean isAn(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch, ch1);
	}
	public static void main(String[] args) {
		String s="eat tea tan ate nat bat aet ant tae";
		isGOA(s);
	}
}
