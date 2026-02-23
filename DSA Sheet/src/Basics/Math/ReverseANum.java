package Basics.Math;

import java.util.Scanner;

/**
 * Problem Statement: Given an integer N return the reverse of the given number.
 * Note: If a number has trailing zeros, then its reverse will not include them.
 * For e.g , reverse of 10400 will be 401 instead of 00401.
 */
public class ReverseANum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reverse = 0;

        /**
         * Steps to remember
         * 1. Loop the num till it's 0;
         * 2. Take out the last digit;
         * 3. Multiply the reverse variable with 10 and then add the temp value;
         * 4. Remove the last digit from it.
         */
        while (num > 0) {
            int temp = num % 10;

            reverse = reverse * 10 + temp;

            num = num / 10;

        }

        System.out.println("Reversed number: " + reverse);
        scanner.close();
    }
}
