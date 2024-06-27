package com.test.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingCharStringFinder {

    private static int get(String str){
        char[] chars = str.toCharArray();

        int l = 0;
        int r = 0;
        int result = 0;
        Set<Character> charset = new HashSet<>();
        for(; r<chars.length; r++) {
            while (charset.contains(chars[r]) && r < chars.length) {
               charset.remove(chars[l]);
               l++;
            }
            charset.add(chars[r]);
            result = r-l > result ? r-l : result;
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "abcdeacforlr";
        String str1 = "abbcderacfforlr";

        System.out.println(get(str));

        System.out.println(get(str1));
    }
}
