package com.test.dsa;

public class TwoSumII {

        public static int[] twoSum(int[] numbers, int target) {
            int l = 0;
            int r = numbers.length -1;
            int[] ints = new int[2];

            while(l < r){
                if(numbers[l]+numbers[r] > target){
                    r--;
                } else if (numbers[l]+numbers[r] < target) {
                    l++;
                }else {
                    ints[0] = l+1;
                    ints[1] = r+1;
                }

            }

            return ints;
        }
    public static void main(String[] args) {

        int[] ints = {5,25,75};
        int[] ints1 = twoSum(ints, 100);
        for (int i: ints1) {
            System.out.println(i);
        }
    }
}
