package Arrays.Easy;

/* 

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..

Examples
Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

*/
public class CountConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1 };

        int count = 0;
        int max = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
