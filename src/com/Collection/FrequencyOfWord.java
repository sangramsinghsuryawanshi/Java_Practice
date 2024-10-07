/*
 * 17. Frequency of Words: Write a 
 * program to find the frequency of each word in a string using
 *  `HashMap`.
 */
package com.Collection;

import java.util.HashMap;

public class FrequencyOfWord 
{
	public static void isFOW(String s) 
	{
		s=s.replaceAll("[^a-zA-Z]", " ");
		String str[]=s.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0;i<str.length;i++)
		{
			if(hm.containsKey(str[i]))
			{
				hm.put(str[i], hm.get(str[i])+1);
			}
			else
			{
				hm.put(str[i], 1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) 
	{
		String s="This is a test. This test is simple.";
		isFOW(s);
	}
}
