package Arrays.Easy;

/* 

    Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

    Examples
    Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
    Output : [6, 7, 1, 2, 3, 4, 5]
    Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
    rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5] 

*/
public class RotateElementRight {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        int n = arr.length;

        int[] result = rotateArray(arr, k, n);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    static int[] rotateArray(int[] arr, int k, int length) {

        if (k == 0)
            return arr;

        k = k % length;

        // reverse the whole array
        revereArray(arr, 0, length - 1);

        // reverse the array by kth element
        revereArray(arr, 0, k - 1);

        // reverse remaning length - k element
        revereArray(arr, k, length - 1);

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
