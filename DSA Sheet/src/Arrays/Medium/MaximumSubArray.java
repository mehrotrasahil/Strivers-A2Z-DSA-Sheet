package Arrays.Medium;

/* 
    Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Examples
    Example 1:
    Input:
    nums = [2, 3, 5, -2, 7, -4]  
    Output: 15  
    Explanation: The subarray from index 0 to index 4 has the largest sum = 15, which is the maximum sum of any contiguous subarray.
*/
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        printTheMaxSubArray(arr);

    }

    // Follow up - Can you print the subarray that has the maximum sum?
    // If you want to find the maximum only remove start, end and startIndex
    // variables.

    static void printTheMaxSubArray(int[] arr) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = -1;
        int end = -1;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = startIndex;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                startIndex = i + 1;
            }
        }

        System.out.println("Maximum Subarray:");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMax Sum = " + maxSum);
    }
}
