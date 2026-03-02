package Sorting.Sorting2;

/* 
    Problem Statement: Given an array of size n, sort the array using Merge Sort.

    Examples
    Input : N=7,arr[]={3,2,8,5,1,4,23}
    Output : {1,2,3,4,5,8,23}
    Explanation : Given array is sorted in non-decreasing order.
    Input : N=5, arr[]={4,2,1,6,7}
    Output : {1,2,4,6,7}
    Explanation : Given array is sorted in non-decreasing order.
*/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2 };

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        // Compare both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaning values
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
