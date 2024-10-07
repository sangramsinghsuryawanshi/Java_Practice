/*
 * 16. List to Map: Write a program to convert a list of strings into a `Map<String,
 *  Integer>`, where the key is the string and the value is its length.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListCovertToMap 
{
	public static void isLCTM(List<String>ls)
	{
		HashMap<String, Integer> sm = new HashMap<>();
		for(int i=0;i<ls.size();i++)
		{
			if(sm.containsKey(ls.get(i)))
			{
				sm.put(ls.get(i), ls.get(i).length());
			}
			else
			{
				sm.put(ls.get(i), ls.get(i).length());
			}
		}
		System.out.println(sm);
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<>();
		li.add("java");
		li.add("C#");
		li.add("ASP.Net");
		li.add("Ruby");
		isLCTM(li);
	}
}
