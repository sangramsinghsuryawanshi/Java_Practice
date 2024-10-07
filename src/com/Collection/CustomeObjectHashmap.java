/*
 * 21. Custom Object HashMap: Create a `HashMap` that stores `Student` 
 * objects as keys and their grades as values. Implement the 
 * `equals()` and `hashCode()` methods in the `Student` class.
 */
package com.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

class Student
{
	private String name;
	private char grade;
	public Student(String name, char grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
public class CustomeObjectHashmap 
{
	public static void main(String[] args) 
	{
		Student s = new Student("sangram", 'S');
		Student s1 = new Student("omkar", 'O');
		Student s2 = new Student("harshad", 'H');
		Student s3 = new Student("aditya", 'A');
		HashMap<String, Character> hm = new HashMap<>();
		hm.put(s.getName(), s.getGrade());
		hm.put(s1.getName(), s1.getGrade());
		hm.put(s2.getName(), s2.getGrade());
		hm.put(s3.getName(), s3.getGrade());
		System.out.print("Name\t\t Grade\n");
		System.out.println();
		for(Entry<String, Character> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
	}
}
