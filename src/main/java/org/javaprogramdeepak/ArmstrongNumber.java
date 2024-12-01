package org.javaprogramdeepak;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        number = sc.nextInt();
        System.out.println("Is Armstrong Number: " + isArmstrong(number));
        sc.close(); // Close the scanner after use
    }
    static boolean isArmstrong(int n) {
        int digits = 0, temp;
        int sum = 0;
        // Calculate the number of digits
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        System.out.println("Number of digits: " + digits);

        // Calculate the sum of powers of digits
        temp = n; // Reassign temp to the original number
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
            temp = temp / 10;
        }

        // Check if the sum equals the original number
        return sum == n;
    }
}
