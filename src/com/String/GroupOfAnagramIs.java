/*
 * 13. Group Anagrams Together from a List of Strings
Input:
["eat", "tea", "tan", "ate", "nat", "bat"]
Output:
[["bat"], ["nat", "tan"], ["ate", "eat", "tea"]] (order can vary)
 */
package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagramIs 
{
	public static void isGOAI(String[] ls)
	{
		Map<String, List<String>> m = new HashMap<>();
		for(String s:ls)
		{
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			String k=new String(ch);
			if(!m.containsKey(k))
			{
				m.put(k, new ArrayList<>());
			}
			m.get(k).add(s);
		}
		System.out.println(m);
	}
	public static void main(String[] args) 
	{
		String s[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
		isGOAI(s);
	}
}
