/*
 * 26. Count Occurrences of a Character: Write a program to count occurrences 
 * of each character in a string using `LinkedHashMap`.
 */
package com.Collection;

import java.util.*;
import java.util.Map.Entry;

public class CountOfOccurencesInLinHashamp 
{
	public static LinkedHashMap<Character, Integer> isFOEEH(String s)
	{
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		String s="programming";
		LinkedHashMap<Character, Integer> h=isFOEEH(s);
		for(Entry<Character, Integer> e:h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
