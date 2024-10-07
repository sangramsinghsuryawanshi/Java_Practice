/*
 * 30. Find the First Non-Repeated Character: Write a program to find the first non-repeated 
 * character in a string using `LinkedHashMap`.
 */
package com.Collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindNonRepeatedEle
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
		String s="abmcadsesdbcpl";
		LinkedHashMap<Character, Integer> h=isFOEEH(s);
		for(Entry<Character, Integer> e:h.entrySet())
		{
			if (e.getValue() == 1) {
                System.out.println("First non-repeated character: " + e.getKey());
                return;
            }
		}
	}
}
