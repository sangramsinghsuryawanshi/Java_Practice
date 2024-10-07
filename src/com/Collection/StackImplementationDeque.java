/*
 * 10. Stack Implementation: Write a program to implement a stack 
 * using `Deque` and perform push, pop, and peek operations.
 */
package com.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImplementationDeque 
{
	public static void main(String[] args) 
	{
		Deque<Integer> q = new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.push(0);
		q.push(10);
		q.pop();
		q.peek();
		System.out.println(q);
	}
}
