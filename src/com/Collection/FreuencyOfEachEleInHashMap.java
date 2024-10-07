/*
 * 4. Frequency of Elements: Write a program to count the 
 * frequency of each element in a list using a `HashMap`.
 */
package com.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class FreuencyOfEachEleInHashMap 
{
	public static HashMap<Character, Integer> isFOEEH(String s)
	{
		HashMap<Character, Integer> hm = new HashMap<>();
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
		HashMap<Character, Integer> h=isFOEEH(s);
		for(Entry<Character, Integer> e:h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
