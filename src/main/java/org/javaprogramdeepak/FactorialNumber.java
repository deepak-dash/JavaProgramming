package org.javaprogramdeepak;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter the Number:");
        int n = sc.nextInt(); // Capture user input

        // Calculate factorial and print the result
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close(); // Close the scanner
    }

    // Static method to calculate factorial recursively
    static int factorial(int n) {
        if (n == 1 || n == 0) { // Base case: factorial of 1 or 0 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }
}
