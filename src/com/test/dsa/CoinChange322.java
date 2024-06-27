package com.test.dsa;

import java.util.Arrays;

public class CoinChange322 {

    private static int change(int[] coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
      //  coins = [3,5,7]
      //  amount =  11
     //   [0, inf, inf, 1, inf, 1, 2, 1, 2, 3, 2, 3]

        for(int i=1; i < amount+1; i++){
            for(int coin : coins){
                if(coin <= i){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        return dp[dp.length-1] == (amount+1) ? -1 : dp[dp.length-1];
    }

    public static void main(String[] args) {
        System.out.println(change(new int[]{3,5,7}, 11));
    }
}
