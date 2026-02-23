package Basics.Math;

import java.util.Scanner;

/* Given an integer N, return the number of digits in N. */

/* 
Examples:

Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
                        
Example 2:
Input:N = 7789              
Output: 4
Explanation: The number 7789 has 4 digits. 

*/
public class CountAllNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        /**
         * Basic approach
         * Here we are type casting int to String to get the length of the String
         */
        String str = String.valueOf(num);
        System.out.println(Integer.valueOf(str.length()));

        /**
         * Log based aproach
         * The logarithmic base 10 of a positive integers gives the number of digits in
         * num.
         * We add 1 to the result to ensure that the count is correct even for numbers
         * that are powers of 10.
         */
        int count = (int) (Math.log10(num) + 1);
        System.out.println(count);

        scanner.close();
    }
}
