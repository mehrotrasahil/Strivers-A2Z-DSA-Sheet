package Sorting.Sorting1;

/* 
    Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

    Examples

    Example 1:
    Input: N = 5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting we get 1,2,3,4,5


    Example 2:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting we get 9,13,20,24,46,52

*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        /**
         * Select the range of the unsorted array: Use an outer loop (i) that runs
         * backward from n-1 to 0 (where n is the size of the array). The value i = n-1
         * means the range is from 0 to n-1, i = n-2 means the range is from 0 to n-2,
         * and so on.
         * 
         * Push the maximum element to the end of the selected range: Use an inner loop
         * (j) that runs from 0 to i-1. Compare adjacent elements and swap them if
         * arr[j] > arr[j+1]. Repeating this process ensures the maximum element in the
         * current range moves to index i.
         * 
         * Progressively sort the array: After each outer loop iteration, the last part
         * of the array becomes sorted. For example:
         * After the first iteration, the element at the last index is sorted.
         * After the second iteration, the last two elements are sorted.
         * This continues until the entire array is sorted.
         * 
         * Complete sorting: After n-1 iterations, the whole array will be sorted.
         * 
         * Note: After each iteration, the sorted portion grows from the end, so the
         * last index of the unsorted range decreases by 1 (controlled by i). The inner
         * loop (j) ensures the maximum element in the range [0…i] is placed at index i.
         */
        for (int i = n - 1; i >= 0; i--) {
            boolean isSwapped = false;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
