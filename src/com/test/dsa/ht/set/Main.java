package com.test.dsa.ht.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


    public static void main(String[] args) {
        int[] nums = {6,5,4,3,11,59,55,2,1,7,25,65};
        int longest = longestConsecutiveSequence(nums);
        System.out.println(longest);

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

    }
}
