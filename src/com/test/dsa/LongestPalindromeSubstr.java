package com.test.dsa;

public class LongestPalindromeSubstr {

    public static String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        String str = "";
        int longestLen = 0;

        for(int i=0; i<= chars.length; i++){

            int l = i;
            int r = i;

            while(l >= 0 && r <= chars.length-1 && chars[l] == chars[r]){

                if(longestLen < (r - l + 1)){
                    str = s.substring(l, r);
                    longestLen = r - l + 1;
                }
                l--;
                r++;
            }

            l = i;
            r = i+1;

            while(l >= 0 && r <= chars.length-1 && chars[l] == chars[r]){

                if(longestLen < (r - l + 1)){
                    str = s.substring(l, r);
                    longestLen = r - l + 1;
                }
                l--;
                r++;
            }

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
