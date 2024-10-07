/*
 * 13. Find Maximum and Minimum: Write a program to find the maximum and minimum elements 
 * from a list using `Collections.max()` and `Collections.min()`.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMin 
{
	public static void isMaMi(List<Integer> l)
	{
		int max=Collections.max(l);
		int i=l.indexOf(max);
		l.remove(i);
		System.out.println(Collections.max(l));
		System.out.println(Collections.min(l));
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
