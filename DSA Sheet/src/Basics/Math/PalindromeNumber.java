package Basics.Math;

import java.util.Scanner;

/**
 * Problem Statement: Given an integer N, return true if it is a palindrome else
 * return false.
 * 
 * A palindrome is a number that reads the same backward as forward. For
 * example, 121, 1331, and 4554 are palindromes because they remain the same
 * when their digits are reversed.
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        boolean isPalindrome = checkPalindrome(num);

        if (isPalindrome) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

        scanner.close();
    }

    private static boolean checkPalindrome(int num) {

        int reverse = 0;
        int copy = num;

        /**
         * We will follow the same pattern as reversing the number, except one change
         * We will create a copy of the original num and perform the operations.
         */
        while (copy > 0) {
            int temp = copy % 10;

            reverse = reverse * 10 + temp;

            copy = copy / 10;
        }

        return num == reverse;
    }

}
