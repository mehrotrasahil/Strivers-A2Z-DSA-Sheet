package Basics.Math;

import java.util.Scanner;

/* 
An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
Examples
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
                                        
Example 2:
Input:N = 371                
Output: True
Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371

*/
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int length = String.valueOf(num).length();
        boolean isArmstrong = checkArmstrongNumber(num, length);
        if (isArmstrong) {
            System.out.println("Number is an Armsstrong Number");
        } else {
            System.out.println("Number is not an ArmsStrong Number");
        }

        sc.close();
    }

    private static boolean checkArmstrongNumber(int num, int length) {

        int result = 0;
        int copy = num;
        while (num > 0) {
            int temp = num % 10;
            int power = (int) Math.pow(temp, length);
            result = result + power;
            num = num / 10;
        }
        return copy == result;
    }
}
