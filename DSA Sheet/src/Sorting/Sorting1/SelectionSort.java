package Sorting.Sorting1;

/* 

    Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

    Examples
    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        int lengthOfArr = arr.length - 1;

        // Asending order sorting
        /**
         * To sort it in a descending order:
         * Run the outer loop from 0 to lengthOfArr, where j <= lengthOfArr
         * Run the inner loop from 0 to i, where j <= i
         */
        for (int i = lengthOfArr; i >= 0; i--) {
            for (int j = lengthOfArr; j >= i; j--) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
