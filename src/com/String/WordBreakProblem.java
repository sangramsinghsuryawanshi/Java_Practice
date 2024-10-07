package com.String;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem 
{
    public static boolean isWBP(String s1, String[] wordDict) {
        Set<String> wordSet = new HashSet<>();
        for (String word : wordDict) {
            wordSet.add(word);
        }

        boolean[] dp = new boolean[s1.length() + 1];
        dp[0] = true;

    
        for (int i = 0; i <s1.length(); i++) {
          
            for (int j = i+1; j < s1.length(); j++) {
               
                if (dp[j] && wordSet.contains(s1.substring(j, i))) {
                    dp[i] = true;
                    break; 
                }
            }
        }

        return dp[s1.length()]; 
    }

    public static void main(String[] args) 
    {
        String s1 = "catsandog";
        String[] s = {"cats", "dog", "sand", "and", "cat"};
        boolean result = isWBP(s1, s);
        System.out.println(result); 
    }
}
