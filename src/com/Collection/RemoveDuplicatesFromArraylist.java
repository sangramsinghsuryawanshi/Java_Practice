/*
 * 2. Removing Duplicates: Write a program to remove 
 * duplicate elements from an `ArrayList` without using `Set`.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesFromArraylist 
{
	public static List<Integer> isRDFA(List<Integer> li)
	{
		for(int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i).equals(li.get(j)))
				{
					li.remove(li.get(j));
				}
			}
		}
		Collections.reverse(li);
		return li;
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<>();
		li.add(9);
		li.add(8);
		li.add(3);
		li.add(7);
		li.add(6);
		li.add(5);
		List<String> l1=Arrays.asList("java","C#","ruby");
		Collections.sort(l1);
		System.out.println(l1);
		li.removeFirst();
		li.removeLast();
		li.remove(li.size()/2);
		System.out.println(li);
		Integer  a1[] = li.toArray(new Integer[0]);
		for(int a: a1)
		{
			System.out.println(a);
		}
	}
}
