/*
 * 18. Sort Map by Keys: Write a program to sort a `HashMap` by keys using `TreeMap`.
 */
package com.Collection;

import java.util.Map;
import java.util.TreeMap;

public class SortKeyValue 
{
	public static void main(String[] args) 
	{
		Map<Integer, Integer> hm = new TreeMap<>();
		hm.put(3, 2);
		hm.put(2, 2);
		hm.put(1, 2);
		hm.put(4, 2);
		System.out.println(hm);
	}
}
