/*
 * 31. Largest Element in a Set: Write a program to find the largest element in a `TreeSet`.
 */
package com.Collection;

import java.util.Set;
import java.util.TreeSet;

public class LargestEleInSet 
{
	public static void isLES(Set<Integer> st)
	{
		int max=st.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		Set<Integer> st = new TreeSet<>();
		st.add(1);
		st.add(19);
		st.add(17);
		st.add(11);
		st.add(12);
		isLES(st);
	}
}
