package Basics.Recurssion;

import java.util.Scanner;

/* 
    Problem Statement: Given a number X,  print its factorial.

    To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

    Note: X  is always a positive number. 

    Examples
    Example 1:
    Input:
    X = 5
    Output:
    120
    Explanation:
    5! = 5*4*3*2*1

*/

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(getFactorial(num));

        sc.close();
    }

    public static int getFactorial(int num) {
        if (num == 1 || num == 0) {
            return num;
        }

        return num * getFactorial(num - 1);
    }
}
