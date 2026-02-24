package Basics.Recurssion;

import java.util.Scanner;

/* 

    Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

    Examples
    Input: N=5
    Output: 15
    Explanation: 1+2+3+4+5=15

    Input: N=6
    Output: 21
    Explanation: 1+2+3+4+5+6=15


*/

class InnerSumOfNNumber {
    public int calSum(int num) {

        if (num == 1) {
            return num;
        }
        return num + calSum(num - 1);

    }

}

public class SumOfNNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        InnerSumOfNNumber innerSumOfNNumber = new InnerSumOfNNumber();

        System.out.println(innerSumOfNNumber.calSum(number));

        sc.close();
    }

}
