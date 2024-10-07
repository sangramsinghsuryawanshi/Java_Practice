/*
 * 20. Merge Two Lists: Write a program to merge two 
 * `ArrayList`s into a single list.
 */
package com.Collection;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoList 
{
	public static void main(String[] args) 
	{
		 List<Integer> l = new LinkedList<>();
	        l.add(1);
	        l.add(2);
	        l.add(3);
	        l.add(4);
	        l.add(5);
	        l.add(6);
	  
	        List<Integer> l1 = new LinkedList<>();
	        l1.add(2);
	        l1.add(8);
	        l1.add(9);
	        l1.add(10);
	        l.retainAll(l1);
		System.out.println(l);
	}
}
