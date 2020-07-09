package com.groot.algorithm.algorithm;

import java.util.Arrays;

public class Algorithm {

    public static int[] add(int[] array, int position, int value) {

        int[] result = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            result[i] = array[i]; //copy result[i] = 10,11,12,13
        }
        result[position] = value;

        for (int i = position + 1; i < result.length; i++) {

            result[i] = array[i - 1];

        }

        return result;

    }

    public int search(int[] array, int value) {
        int loc = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                loc = i;
                break;
            }
        }

        return loc;

    }

    public int[] delete(int[] array, int value) {

        int loc = search(array, value);

        if (loc >= 0) {

            for (int i = loc + 1; i < array.length; i++) {
                array[i - 1] = array[i];
                
            }

        }
        return Arrays.copyOf(array, array.length - 1);

    }

    public static void main(String[] args) {

        Algorithm arr = new Algorithm();

//          nums[i]={0,     1,   2,    3,    4,   5};
        int[] nums = {10, 11, 12, 13, 14, 15};
        
//        int index = arr.search(nums, 13);
//        System.out.println(index);

        nums = arr.delete(nums, 14);

        for ( int i = 0; i < nums.length; i++) {
            System.out.printf("Array at %d after delete  %d\n",i,nums[i]);
        }

    }

}
