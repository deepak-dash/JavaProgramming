package org.javaprogramdeepak;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {

        String str []={"deepak","dash", "test" , "dash" , "test2"};
        System.out.println("*****Brute Force*****");
        for (int i = 0; i < str.length ; i++) {
            for (int j = i+1; j< str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println("Duplicate Element is :" + str[i]);
                    break;
                }
            }

        }
        System.out.println("*****HashSet*****");
        Set<String> data= new HashSet<String>();
        for (String e: str){
            if (data.add(e)==false){
                System.out.println(e);
            }
        }
        System.out.println("*****Hashmap*****");
        Map<String , Integer> strmap= new HashMap<String , Integer>();
        for (String e:str){
            Integer count=strmap.get(e);
            if (count==null){
                strmap.put(e,1);
            }else {
                strmap.put(e, ++count);
            }

        }



    }
}
