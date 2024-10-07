/*
 * 22. Check Palindrome List: Write 
 * a program to check if a list of integers is a palindrome.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class PalindromicList 
{
	public static void isPL(List<Integer>l)
	{
		List<Integer>l1=new ArrayList<>(l);
		l1=l1.reversed();
		System.out.println(l1);
		System.out.println(l);
		if(l.equals(l1))
		{
			System.out.println("Palindromic");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(1);
		isPL(l);
	}
}
