package Basics.Math;

import java.util.Scanner;

/* 
Problem Statement: Given an integer N, check whether it is prime or not. 
A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

Examples

Example 1:
Input:N = 2
               
Output:True
                
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                        
Example 2:
Input:N =10                
                
Output: False
                
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.   

*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number: ");
        int num = sc.nextInt();

        boolean isPrime = checkPrimeNumber(num);
        if (isPrime) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Give number is not a prime number");
        }

        sc.close();

    }

    private static boolean checkPrimeNumber(int num) {

        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;

                if (i != num / i) {
                    count++;
                }
            }
        }

        return count == 2 ? true : false;
    }
}
