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
         * Start outer loop from i = 0 to n - 2
         * 
         * Assume minIndex = i
         * 
         * Run inner loop from j = i + 1 to n - 1
         * 
         * If arr[j] < arr[minIndex]
         * → update minIndex = j
         * 
         * After inner loop ends
         * → swap arr[i] and arr[minIndex]
         * 
         * Repeat
         */
        for (int i = 0; i < lengthOfArr; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
