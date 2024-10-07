/*
 * 12. Synchronized List: Write a program to create a synchronized list using `Collections.synchronizedList()` and demonstrate safe 
 * iteration in a multi-threaded environment.
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		List<Integer> l1 = Collections.synchronizedList(li);
		Thread t = new Thread(()-> {
			synchronized(l1)
			{
				l1.add(5);
				l1.add(6);
				System.out.println("writer Thread: "+l1);
			}
		});
		Thread t2 = new Thread(()->{
			synchronized (l1) {
			
				System.out.println("Reader: ");
				for(int v:l1)
				{
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(v);
				}
			}
		});
		t.start();
		t2.start();
	}
}
