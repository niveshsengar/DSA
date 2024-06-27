package com.test.dsa;

public class PalindromeOrNot {

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        char[] chars = s.toCharArray();
        int j = chars.length-1;


        for(int i = 0; i<=j; i++, j--){
            while((chars[i] <97 || chars[i]>122) && i<j){
                if(chars[i] >= 65 && chars[i] <= 90){
                    chars[i] += 32;
                } else if ((chars[i] >= 48 && chars[i] <= 57)) {
                    break;
                } else{
                    i++;
                }
            }
            while((chars[j] <97 || chars[j]>122) && i<j){
                if(chars[j] >= 65 && chars[j] <= 90){
                    chars[j] += 32;
                }else if ((chars[j] >= 48 && chars[j] <= 57)) {
                    break;
                }else{
                    j--;
                }
            }
            if(chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racaacar"));
    }
}
