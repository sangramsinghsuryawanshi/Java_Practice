/*
 * 14. Find the Longest Consecutive Sequence in an Unsorted Array
Input:
Array: [100, 4, 200, 1, 3, 2]
Output: 4 (sequence: 1, 2, 3, 4)
 */
package com.Array;

import java.util.HashSet;

public class LongConjiArray 
{
    public static int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) 
        {
            numSet.add(num);
        }
        System.out.println(numSet);
        int longestStreak = 0;

        for (int num : numSet) 
        {
            if (!numSet.contains(num - 1)) 
            {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1))
                {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) 
    {
        int[] a = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(a);
        System.out.println("Longest Consecutive Sequence Length: " + result); // Output: 4
    }
}
