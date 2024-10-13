/*
 * 11. Implement a Custom HashMap
Input:
Operations:
put("one", 1)
put("two", 2)
get("two")
Output: 2
 */
package com.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class ImplementCustomHashMap 
{
	public static void isICH()
	{
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		System.out.println(hm.get("two"));
		for(Entry<String, Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey());
		}
	}
	public static void main(String[] args) 
	{
		isICH();
	}
}
