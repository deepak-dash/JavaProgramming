package org.javaprogramdeepak;

public class ReverseString {
    public static void main(String[] args) {
        String str="deepak";
        String reversestr="";
        char ch;
        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            reversestr= ch + reversestr;

        }
        System.out.println("Reverse String is :" + reversestr);
    }
}
