package Sorting.Sorting2;

/*
 * QUICK SORT IMPLEMENTATION (Hoare-style Partition)
 *
 * Problem:
 * Given an array of size n, sort the array using Merge Sort.
 * Core Idea:
 * 1. Pick a pivot element.
 * 2. Rearrange elements so that:
 *      - elements smaller than pivot go to the left
 *      - elements greater than pivot go to the right
 * 3. Place pivot in its correct sorted position.
 * 4. Recursively apply the same logic to left and right subarrays.
 *
 * Key Properties:
 * - Divide and Conquer algorithm
 * - Average Time Complexity: O(n log n)
 * - Worst Case Time Complexity: O(n^2) (bad pivot choice)
 * - In-place sorting (no extra array)
 * - Not a stable sort
 */

public class QuickSort {

    public static void main(String[] args) {

        // Input array to be sorted
        int[] arr = { 5, 1, 3, 2, 4 };

        // Call quickSort on the full array
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /*
     * quickSort method
     *
     * Parameters:
     * - arr : array to be sorted
     * - low : starting index of the current subarray
     * - high : ending index of the current subarray
     *
     * Logic:
     * - If the subarray has more than one element:
     * 1. Partition the array and get pivot index.
     * 2. Recursively sort elements on the left of pivot.
     * 3. Recursively sort elements on the right of pivot.
     *
     * Base Case:
     * - When low >= high, the subarray has 0 or 1 element → already sorted.
     */
    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition the array and get the final position of pivot
            int pIndex = partition(arr, low, high);

            // Recursively sort the left subarray
            quickSort(arr, low, pIndex - 1);

            // Recursively sort the right subarray
            quickSort(arr, pIndex + 1, high);
        }
    }

    /*
     * partition method (Hoare-style with pivot at start)
     *
     * Purpose:
     * - Rearrange the array such that:
     * - All elements <= pivot are on the left
     * - All elements > pivot are on the right
     * - Finally, place the pivot in its correct sorted position.
     *
     * Parameters:
     * - arr : array being sorted
     * - low : start index of the subarray
     * - high : end index of the subarray
     *
     * Returns:
     * - The index where the pivot is finally placed.
     */
    private static int partition(int[] arr, int low, int high) {

        /*
         * Choose the first element as pivot.
         * Pivot will eventually be placed at its correct position.
         */
        int pivot = arr[low];

        /*
         * i → pointer that moves from left to right
         * j → pointer that moves from right to left
         *
         * These pointers help identify misplaced elements.
         */
        int i = low;
        int j = high;

        /*
         * Loop until both pointers cross each other.
         * The goal is to:
         * - Move i forward until an element greater than pivot is found.
         * - Move j backward until an element smaller than or equal to pivot is found.
         * - Swap these misplaced elements.
         */
        while (i < j) {

            // Move i forward while elements are <= pivot
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            // Move j backward while elements are > pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }

            // Swap misplaced elements on wrong sides of pivot
            if (i < j) {
                swap(arr, i, j);
            }
        }

        /*
         * Final Step:
         * - j now points to the correct position of the pivot.
         * - Swap pivot (at low) with element at j.
         *
         * After this swap:
         * - Pivot is in its final sorted position.
         * - Left side contains elements <= pivot.
         * - Right side contains elements > pivot.
         */
        swap(arr, low, j);

        // Return pivot index
        return j;
    }

    /*
     * swap helper method
     *
     * Purpose:
     * - Swap elements at index i and j in the array.
     *
     * This is a utility method used by the partition logic.
     */
    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}