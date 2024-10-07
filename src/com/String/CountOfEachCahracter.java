package com.String;

import java.util.HashMap;

public class CountOfEachCahracter 
{
	public static HashMap<Character, Integer> isCount()
	{
		String str = "programming";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) 
	{
		System.out.println(isCount());
	}
}
