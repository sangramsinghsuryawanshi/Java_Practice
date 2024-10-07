/*
 * 11. Remove Null Values: Write a program to remove 
 * all `null` values from a list of strings.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNullValuesFromString 
{
	public static void isRNFS(List<String> l)
	{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals("null"))
			{
				l.remove(i);
				i--;
			}
		}
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			al.add(sc.nextLine());
		}
		isRNFS(al);
	}
}
