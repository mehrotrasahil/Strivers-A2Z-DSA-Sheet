package Arrays.Medium;

/* 

Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.

Examples
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

*/
public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0 };

        sortArray2(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    // Better Approach
    static void sortTheArr(int[] arr) {
        int cnt0 = 0, cnt1 = 0;

        // counting the 0's and 1's
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                cnt0++;
            else if (arr[i] == 1)
                cnt1++;
        }

        // Replacing value of arr[i] with 0s,1s and 2s till the total number of 0,1 and
        // 2 present in the array
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    // Dutch National Flag algorithm.

    /**
     * We divide the array into three partitions using three pointers – low, mid,
     * and high.
     * From 0 to low-1, we’ll keep only 0s
     * From low to mid-1, only 1s
     * From high+1 to n-1, only 2
     * The range from mid to high is the unsorted zone we’re scanning and fixing. At
     * each step:
     * If arr[mid] == 0, it belongs to the left section → swap with low, move both
     * low and mid.
     * If arr[mid] == 1, it’s already in the middle section → just move mid.
     * If arr[mid] == 2, it belongs to the right section → swap with high, only move
     * high.
     * When you swap with high, you don’t move mid because the incoming value might
     * still be 0 or 2 which needs processing.This ensures we sort the array in one
     * single pass without using extra space.
     * Start with three pointers at the beginning, middle, and end of the array.
     * Iterate while the middle pointer is less than or equal to the end pointer.
     * If the current element belongs to the front section:
     * Swap it with the element at the front boundary.
     * Move both front and middle boundaries forward.
     * If the current element belongs to the middle section:
     * Move the middle boundary forward.
     * If the current element belongs to the end section:
     * Swap it with the element at the end boundary.
     * Move the end boundary backward.
     * Repeat until all elements are in their correct zones.
     * 
     * @param arr
     */
    static void sortArray2(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
