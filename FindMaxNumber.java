package com.groot.day2;

public class FindMaxNumber {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        int[] array = new int[1000000];

        int toFind = 999999;
        int count = 0;
        boolean isEven = (toFind % 2) == 0;

        long startTime = System.currentTimeMillis();

        if (toFind >= 0) {
            if (isEven) {

                for (int i = 0; i < array.length; i=i+2) {
                    count++;
                    if (toFind >= 0) {

                        if (toFind == i) {
                            System.out.println("Total counted to find number : " + count);
                        }
                    }

                }                
                
            }else{

                for (int i = 1; i < array.length; i=i+2) {
                    count++;
                    if (toFind >= 0) {

                        if (toFind == i) {
                            System.out.println("Total counted to find number : " + count);
                        }
                    }

                }        

            }  

        } else{
            print("Invalid Integer");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken = " + (endTime - startTime) + " ms");

        // Total count : 500000
        // Time : 14ms

    }

}