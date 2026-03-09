package Arrays.Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/* 

    Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.

    Examples: 

    Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
    Output: 6
    Explanation: All the numbers from 1 to 8 are present except 6.

    Input: arr[] = [1, 2, 3, 5]
    Output: 4
    Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
*/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };

        int result = getMissingNumber(arr);

        // Using Streams
        int missingNumber = IntStream.rangeClosed(1, 10)
                .filter(num -> Arrays.stream(arr)
                        .noneMatch(n -> n == num))
                .findFirst().orElse(-1);

        System.out.println(result);
    }

    static int getMissingNumber(int[] arr) {
        int sum = 0;
        int n = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Formula for sum of n natural numbers
        long expectedSum = n * (n + 1) / 2;

        return (int) (expectedSum - sum);
    }
}
