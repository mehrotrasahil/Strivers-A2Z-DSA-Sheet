package Basics.Recurssion;

import java.util.Scanner;

/* 

    Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

    Examples
    Example 1:
    Input: N = 5
    Output: 0 1 1 2 3 5
    Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

    Example 2:
    Input: 6
    Output: 0 1 1 2 3 5 8
    Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

*/
public class Fabonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(fibonacci(num)); // Output: 3

        sc.close();

    }

    public static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        }

        // Recursive case: calculate previous two terms
        int last = fibonacci(N - 1); // (N-1)th term
        int slast = fibonacci(N - 2); // (N-2)th term

        return last + slast;
    }
}
