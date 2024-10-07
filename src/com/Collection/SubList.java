/*
 * 28. Sublist Example: Write a program to extract a sublist from an
 *  `ArrayList` and modify it. Show how changes reflect in the original list.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class SubList 
{
	public static void isMaMi(List<Integer> l)
	{
		List<Integer> l1 = l.subList(1, 4);
		System.out.println(l1);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<>();
		li.add(9);
		li.add(3);
		li.add(7);
		li.add(6);
		li.add(5);
		isMaMi(li);
	}
}
