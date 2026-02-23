package Basics.Math;

import java.util.Scanner;

/* 
Given two integers N1 and N2, find their greatest common divisor.

Examples
Example 1:
Input: N1 = 9, N2 = 12

Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)

Example 2:
Input: N1 = 20, N2 = 15

Output: 5
Explanation:
Factors of 20: 1, 2, 4, 5, 10, 20
Factors of 15: 1, 3, 5, 15
Common Factors: 1, 5
Greatest common factor: 5 (GCD)
*/
public class GCD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        // Basic approach
        int result = getTheGcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result + "using Basic approach");

        // Euclidean Algorith

        int gcd = getGcdUsingEuclideanAlgo(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd + "Using Euclidean Algo");
        scanner.close();

    }

    private static int getTheGcd(int a, int b) {

        int result = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;

    }

    /**
     * Steps:
     * While b ≠ 0
     * 
     * Compute r = a % b
     * 
     * Update:
     * 
     * a = b
     * b = r
     * 
     * When b = 0, return a
     * 
     * One-line formula:
     * gcd(a, b) = gcd(b, a % b)
     * Remember:
     * 
     * Stop when b = 0
     * 
     * Time Complexity = O(log(min(a, b)))
     * 
     * Iterative uses O(1) space
     * 
     * @param a
     * @param b
     * @return
     */
    private static int getGcdUsingEuclideanAlgo(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
