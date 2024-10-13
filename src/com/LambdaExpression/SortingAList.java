/*
 * Original List: [apple, banana, kiwi, pineapple, orange]
Sorted by length (ascending): [kiwi, apple, banana, orange, pineapple]
Sorted by length (descending): [pineapple, banana, orange, apple, kiwi]

 */
package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface SortLen
{
	List<String> SL(List<String> s);
}
public class SortingAList 
{
	public static void main(String[] args) 
	{
		List<String> ls = Arrays.asList("apple, banana, kiwi, pineapple, orange");
		SortLen STL=(s)->{
			List<String> l1=ls.stream().sorted((s1,s2)->Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
			return l1;
		};
		STL.SL(ls);
	}
}
