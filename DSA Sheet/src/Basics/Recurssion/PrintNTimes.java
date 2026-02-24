package Basics.Recurssion;

import java.util.Scanner;

/* 
    Problem Description: Given an integer N, write a program to print your name N times.

    Examples
    Input: N = 3
    Output: Ashish Ashish Ashish 
    Explanation: Name is printed 3 times.
    Input: N = 1
    Output: Ashish 
    Explanation: Name is printed once.

*/

class Sol {
    public void printName(int num) {
        while (num != 0) {
            System.out.println("Sahil");
            num--;
        }
    }
}

public class PrintNTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Sol sol = new Sol();

        sol.printName(num);

        sc.close();
    }
}
