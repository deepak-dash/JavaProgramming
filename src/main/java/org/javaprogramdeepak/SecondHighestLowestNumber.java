package org.javaprogramdeepak;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumber {
    public static void main(String[] args) {
        //List<Integer> list= Arrays.asList(12,7,1,0,7,90,40,20,5,8,10);

       // int secHighest= list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        //System.out.println(secHighest);

        //int secLowest=list.stream().sorted().distinct().skip(1).findFirst().get();
        //System.out.println(secLowest);
        
        int [] arr= {12,7,1,0,7,90,40,20,5,8,10};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]<arr[j]){
                      temp = arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                }
                
            }
            
        }
        System.out.println("Second Largest element is :" + arr[1]);

    }
}
