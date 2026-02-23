package Basics.Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
A divisor of an integer N is a positive integer that divides N without leaving a remainder. 
In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Examples
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.

*/
public class DivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        /* Basic approach */
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // arr.add(i);
        // }
        // }

        /**
         * Optimized approach
         * Step 1
         * Create an empty list res.
         * Step 2
         * Loop from:
         * i = 1 to while (i * i ≤ N)
         * 
         * Step 3
         * For each i, check:
         * If N % i == 0
         * If true:
         * Add i to result.
         * If i != N / i, also add N / i.
         * 
         * Step 4
         * After loop ends, return res.
         */
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                arr.add(i);

                if (i != num / i) {
                    arr.add(num / i);
                }
            }
        }
        System.out.println(arr);

        sc.close();
        ;
    }
}
