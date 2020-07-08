package com.groot.day2;

public class FindMaxNumber {

    public void print(Object obj){
        System.out.println(obj);
    }


    public static void main(String[] args){

        int[] array = new int[1000000];

        int toFind = 999999;
        int count =0;

        long startTime = System.currentTimeMillis();

        for(int i=0; i<array.length;i++){
             count++;
            if(toFind>=0){

                if(toFind==i){
                   System.out.println( "Total counted to find number : " + count);
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken = " + (endTime-startTime) + " ms");


        //Total count : 1000000
        //Time : 15ms





    } 
    
}