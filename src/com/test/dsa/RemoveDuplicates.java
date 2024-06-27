package com.test.dsa;

public class RemoveDuplicates {

    private static int getLengthAfter(int[] nums){

        if(nums.length == 0){
            return 0;
        }
        int write = 1;
        for(int read = 1; read < nums.length; read++){
            if(nums[read] != nums[read-1]){
                nums[write++] = nums[read];
            }
        }
        return write;
    }
    public static void main(String[] args) {
        int[] ints = {1,1,1,2,2,3,4,5,6,6,7};

        System.out.println(getLengthAfter(ints));
    }
}
