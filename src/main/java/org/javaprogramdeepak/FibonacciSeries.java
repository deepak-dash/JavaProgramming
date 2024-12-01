package org.javaprogramdeepak;

public class FibonacciSeries {
    public static void main(String[] args) {
          int n =10 , firstnumber=0 , secondnum=1;
          int nextnum;
        for (int i = 1; i <=n ; i++) {
            System.out.print(firstnumber + " , ");
            nextnum= firstnumber + secondnum;
            firstnumber= secondnum;
            secondnum=nextnum;
            
        }
          
    }
}
