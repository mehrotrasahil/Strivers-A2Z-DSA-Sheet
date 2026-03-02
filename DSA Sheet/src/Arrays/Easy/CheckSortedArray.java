package Arrays.Easy;

/* 

Problem Statement: Given an array of size n, write a program to check if the given array is sorted in 
(ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Examples
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, 
So the answer is True.

*/
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        boolean isSorted = optimalSortedArrayCheck(arr);
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    // ---------Brute force---------------------
    // ---------Time complexity = O(n^2)--------
    static boolean checkSortedArray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean optimalSortedArrayCheck(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
