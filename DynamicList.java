package com.groot.day2.util;

public class DynamicList {

    int length = 0;
    int[] nums = new int[length];
    int position = -1;

    public void add(int value) {

        if (length == 0) {
            nums = new int[++length];
            nums[length - 1] = value;

        } else {
            int[] result = new int[length + 1];
            for (int i = 0; i < length; i++) {
                result[i] = nums[i];
            }
            result[length] = value;
            nums = result;

            length++;
        }

    }

    public int get(int index) {
        return nums[index];
    }

    public int getValue() {
        return nums[position];
    }

    public boolean next() {
        if (position < length - 1) {

            position++;
            return true;

        }
        return false;
    }

    public void remove(int position) {

        int[] result = new int[nums.length - 1];

        for (int i = 0; i < position; i++) {
            result[i] = nums[i];
        }

        for (int i = position + 1; i < nums.length; i++) {

            result[position] = nums[i];
            position++;

        }

        nums = result;
        length = nums.length;

    }

    public void addValue(int value, int position) {

        int[] result = new int[nums.length + 1];

        for (int i = 0; i < position; i++) {
            result[i] = nums[i];
        }

        result[position] = value;

        for (int i = position + 1; i < result.length; i++) {
            result[i] = nums[i - 1];

        }

        nums = result;
        length++;

    }

    public  int search(int value) {

        int loc = -1;

        if (value >= 0) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == value) {
                    loc = i;
                }
            }

        }

        return loc;

    }

    public void delete(int value){

        int loc = search( value);

        if(loc>0){

            for(int i=loc+1;i<nums.length;i++){

                nums[i-1]=nums[i];

            }

            length= nums.length-1;


        }

        

    }

    public int size() {
        return length;
    }

}