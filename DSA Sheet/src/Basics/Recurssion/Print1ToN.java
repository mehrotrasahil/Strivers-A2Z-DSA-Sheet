package Basics.Recurssion;

import java.util.Scanner;

/* 

    Problem Description: Given an integer N, write a program to print numbers from 1 to N.

    Examples
    Input: N = 4
    Output: 1, 2, 3, 4
    Explanation: All the numbers from 1 to 4 are printed.
    Input: N = 1
    Output: 1 
    Explanation: This is the base case.

*/

class Solution {
    public void printnumber(int num, int counter) {
        if (counter > num) {
            return;
        }
        System.out.println(counter);

        printnumber(num, counter + 1);

        // Print the number in reverse
        /*
         * if (num == 0) {
         * return;
         * }
         * System.out.println(num);
         * printnumber(num - 1, counter);
         */

    }
}

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        Solution sol = new Solution();
        int counter = 1;
        sol.printnumber(num, counter);

        sc.close();
    }
}
