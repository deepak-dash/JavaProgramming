package org.javaprogramdeepak;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str= "Automation";
        int count =0;
        char []ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if (ch[i] ==ch[j]){
                    System.out.println("Duplicate Characters:" + ch[j]);
                    count++;
                }
                
            }
            
        }
        System.out.println("Duplicate character" + count);
    }
}
