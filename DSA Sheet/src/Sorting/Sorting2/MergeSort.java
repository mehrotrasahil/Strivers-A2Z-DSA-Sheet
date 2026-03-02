package Sorting.Sorting2;

/*
 * MERGE SORT IMPLEMENTATION
 *
 * Problem:
 * Given an array of size n, sort the array using Merge Sort.
 *
 * Core Idea:
 * Merge Sort follows the Divide and Conquer approach:
 * 1. Divide the array into two halves.
 * 2. Recursively sort both halves.
 * 3. Merge the two sorted halves into a single sorted array.
 *
 * Key Properties:
 * - Time Complexity (Best / Average / Worst): O(n log n)
 * - Space Complexity: O(n) (uses extra temporary array)
 * - Stable sorting algorithm
 * - Not an in-place sort
 */

public class MergeSort {

    public static void main(String[] args) {

        // Input array to be sorted
        int[] arr = { 5, 3, 1, 4, 2 };

        // Start merge sort on the entire array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /*
     * mergeSort method (Recursive)
     *
     * Parameters:
     * - arr : array to be sorted
     * - low : starting index of the current subarray
     * - high : ending index of the current subarray
     *
     * Logic:
     * - If the subarray has more than one element:
     * 1. Find the middle index.
     * 2. Recursively sort the left half.
     * 3. Recursively sort the right half.
     * 4. Merge both sorted halves.
     *
     * Base Case:
     * - When low >= high, the subarray has 0 or 1 element → already sorted.
     */
    private static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return; // Base case
        }

        /*
         * Find the middle index safely to avoid overflow.
         * mid divides the array into:
         * - left half → low to mid
         * - right half → mid + 1 to high
         */
        int mid = low + (high - low) / 2;

        // Recursively sort the left half
        mergeSort(arr, low, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);

        // Merge the two sorted halves
        merge(arr, low, mid, high);
    }

    /*
     * merge method
     *
     * Purpose:
     * - Merge two already sorted subarrays into a single sorted array.
     *
     * Subarrays:
     * - Left subarray → indices from low to mid
     * - Right subarray → indices from mid + 1 to high
     *
     * Parameters:
     * - arr : original array
     * - low : starting index of left subarray
     * - mid : ending index of left subarray
     * - high : ending index of right subarray
     */
    private static void merge(int[] arr, int low, int mid, int high) {

        /*
         * Temporary array to store merged result.
         * Size = total number of elements in both subarrays.
         */
        int[] temp = new int[high - low + 1];

        /*
         * left → pointer for left subarray
         * right → pointer for right subarray
         * index → pointer for temp array
         *
         * NOTE:
         * - low, mid, high are fixed boundaries.
         * - left and right are moving pointers.
         */
        int left = low;
        int right = mid + 1;
        int index = 0;

        /*
         * Compare elements from both subarrays and
         * copy the smaller element into temp.
         */
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        /*
         * Copy any remaining elements from the left subarray.
         * (Right subarray is already exhausted)
         */
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        /*
         * Copy any remaining elements from the right subarray.
         * (Left subarray is already exhausted)
         */
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        /*
         * Copy the merged and sorted elements
         * back into the original array.
         */
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}