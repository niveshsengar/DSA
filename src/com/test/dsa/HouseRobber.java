package com.test.dsa;

public class HouseRobber {

    private static int maxProfit(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        int rob1 = nums[0], rob2 = nums[1];
        for(int i = 2; i<nums.length; i++){
            int temp = Math.max(nums[i]+rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,5,6,3,2,1,1,1,2,3,4,5}));
    }
}
