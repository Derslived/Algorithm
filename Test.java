package com.groot.day2;

public class Test {

   static int count =0;

   static int findNumber(int[] array, int start, int end, int x){
   

    count++;

    if(end>=start){

        int mid = start + (end-start) /2;

        if(array[mid] == x)
        return mid;

        if(array[mid] > x)

            return findNumber(array, mid +1, end, x);

            return findNumber(array, start, mid-1, x);




    }

    return -1;

    }

    public static void main(String[] args) {



        int[] nums = new int[1000000];

        for(int i=0;i<nums.length;i++){
            nums[i] = i;
        }

        int high = nums.length-1;
        long startTime = System.currentTimeMillis();

        Test.findNumber(nums, 0, high, 555555);

        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime));
        System.out.println(count);


    }

}