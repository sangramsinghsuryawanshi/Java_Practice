/*
 * 2. Group Anagrams
Problem: Given an array of strings, group anagrams together.
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 */
package com.String;

import java.util.*;

public class GroupOfAnagram {

    public static void groupAnagrams(String[] strs) {
       Map<String, List<String>> ans = new HashMap<String, List<String>>();
       for(String s:strs)
       {
    	   char ch[]=s.toCharArray();
    	   Arrays.sort(ch);
    	   String key = new String(ch);
    	   if(!ans.containsKey(key))
    	   {
    		   ans.put(key, new ArrayList<>());
    	   }
    	   ans.get(key).add(s);
       }
       System.out.println(ans);
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(words);

    }
}
