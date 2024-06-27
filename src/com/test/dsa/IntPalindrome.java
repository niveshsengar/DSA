package com.test.dsa;

import java.util.ArrayList;
import java.util.List;

public class IntPalindrome {

    public static boolean palindrome(int x){
        if(x < 0){
            return false;
        }

        if(x < 10){
            return true;
        }
        List<Integer> ints = new ArrayList<>();
        int y = x/10;
        int r = x%10;
        ints.add(r);
        while(y>=1){
            r = y%10;
            ints.add(r);
            y = y/10;
        }

        for(int i=0; i<ints.size()/2; i++){
            if(ints.get(i) != ints.get(ints.size()-1-i)){
                return false;
            }
        }

        return true;
    }

    public static boolean faster(int x){

        if(x < 0){
            return false;
        }
        if(x <= 9){
            return true;
        }

        int y = x;
        int reverse = 0;

        while(y >=1){
            int r = y%10;
            reverse = 10*reverse + r;
            y = y/10;
        }

        return (x == reverse);
    }

    public static void main(String[] args) {
        //System.out.println(palindrome(1001));
        System.out.println(faster(5115));
    }
}
