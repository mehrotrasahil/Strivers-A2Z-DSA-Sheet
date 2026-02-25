package Sorting.Sorting1;

/* 

    Problem Statement: Given an array of N integers, write a program to implement the Insertion Sorting algorithm.

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
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int lengthOfArr = arr.length;

        for (int i = 1; i < lengthOfArr; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
