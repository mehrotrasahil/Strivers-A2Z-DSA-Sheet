package Arrays.Easy;

/* 

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.


Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
Output : [3, 4, 5, 6, 1, 2]
Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

*/
public class RotateElementLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        int length = arr.length;

        int[] result = rotateArray(arr, k, length);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] rotateArray(int[] arr, int k, int length) {
        if (k == 0)
            return arr;

        // If value of k is greater than length of the array
        k = k % length;

        // reverse the kth element
        revereArray(arr, 0, k - 1);

        // reverse the remaning length - k element
        revereArray(arr, k, length - 1);

        // reverse the whole array
        revereArray(arr, 0, length - 1);

        return arr;

    }

    static void revereArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
