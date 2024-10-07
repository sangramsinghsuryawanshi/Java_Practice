/*
 * 25. Remove Even Numbers: Write a program to 
 * remove all even numbers from a list using `Iterator`.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAllEvenNumber 
{
	public static void isRAEN(List<Integer>l)
	{
		Iterator<Integer> e = l.iterator();
		while(e.hasNext())
		{
			if(e.next()%2==0)
			{
				e.remove();
			}
		}
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<Integer>l=new ArrayList<>();
		 	l.add(1);
	        l.add(2);
	        l.add(3);
	        l.add(4);
	        l.add(5);
	        l.add(6);
	        isRAEN(l);
	}
}
