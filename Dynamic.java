package com.groot.day2;

import com.groot.day2.util.DynamicList;

public class Dynamic {

    public static void main(String[] args) {
        DynamicList list = new DynamicList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        
        
       list.delete(4);

     for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
     }
        
     
      
    }

}