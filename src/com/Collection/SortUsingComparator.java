/*
 * 7. Custom Sorting: Write a program to sort a list of `Employee` objects 
 * (with fields `name`, `age`) based on age using `Comparator`.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Age 
{
	private String name;
	private int age;
	
	public Age(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
class SortAge implements Comparator<Age>
{

	@Override
	public int compare(Age o1, Age o2) 
	{
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge()>o1.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class SortUsingComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Age> ag = new ArrayList<>();
		ag.add(new Age("sangram", 18));
		ag.add(new Age("harshad", 19));
		ag.add(new Age("omkar", 20));
		ag.add(new Age("aditya", 21));
		Collections.sort(ag, new SortAge());
		for(Age AG:ag)
		{
			System.out.println(AG.getName()+" "+AG.getAge());
		}
	}
}
