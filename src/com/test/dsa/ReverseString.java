package com.test.dsa;

public class ReverseString {

    private static String reverseString(String str){
        char[] chars = str.toCharArray();
        char[] reverseChars = new char[chars.length];

        int j = 0;
        for(int i=chars.length-1; i>=0; i--){
             reverseChars[j++] = chars[i];
        }

        return new String(reverseChars);

    }

    public static void main(String[] args) {
        System.out.println(reverseString("ABCDEFGH"));
    }
}
