package com.test.dsa;

public class SecondHighestNumber {

    public static int getSecondHighest(int[] array){

        int max = array[0];
        int secondHighest = 0;


        for(int i=0; i < array.length; i++){

            if (array[i] > max) {
                secondHighest = max;
                max = array[i];
            }else if(array[i] > secondHighest){
                    secondHighest = array[i];
            }
        }
        return secondHighest;

    }

    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 7, 6, 5};
        System.out.println(SecondHighestNumber.getSecondHighest(nums));

    }
}
