package Arrays.Easy;

import java.util.Map;
import java.util.HashMap;

/*
    PROBLEM: Longest Subarray with Sum = K (Array may contain NEGATIVE numbers)

    Given:
    An integer array that may contain positive and negative numbers,
    and a target value K.

    Task:
    Find the length of the longest contiguous subarray whose sum equals K.

    Example:
    arr = [1, -1, 5, -2, 3]
    k = 3

    Longest subarray with sum = 3:
    [1, -1, 5, -2]

    length = 4

    ------------------------------------------------------------

    WHY SLIDING WINDOW DOES NOT WORK HERE

    Sliding window works only when numbers are positive because:

        Adding element  -> sum increases
        Removing element -> sum decreases

    With negative numbers this rule breaks.

    Example:
    [2, -1, 2]

    Removing -1 increases the sum instead of decreasing it.

    Therefore we must use PREFIX SUM + HASHMAP.

    ------------------------------------------------------------

    PREFIX SUM CONCEPT

    prefixSum[i] = sum of elements from index 0 to i

    Example:
    arr = [1,2,3,4]

    prefix sums:
    [1,3,6,10]

    ------------------------------------------------------------

    IMPORTANT MATHEMATICAL INSIGHT

    If:

        prefixSum[j] - prefixSum[i] = k

    then the subarray between:

        (i+1 ... j)

    has sum = k

    Rearranging:

        prefixSum[i] = prefixSum[j] - k

    Meaning:

    If we have already seen (prefixSum - k),
    then a subarray with sum = k exists.

    ------------------------------------------------------------

    HASHMAP PURPOSE

    Map stores:

        prefixSum → index where it first appeared

    Why first appearance?

    Because the earliest index produces the longest subarray.

    Example:
    prefixSum = 5 appears at index 2 and 6

    Using index 2 gives longer subarray than index 6.

    ------------------------------------------------------------

    ALGORITHM

    1. Initialize prefixSum = 0
    2. Traverse the array
    3. Add current element to prefixSum
    4. If prefixSum == k → subarray from start exists
    5. Check if (prefixSum - k) exists in map
    6. If yes → calculate subarray length
    7. Update maximum length
    8. Store prefixSum in map (only first occurrence)

    ------------------------------------------------------------

    TIME COMPLEXITY
    O(n)

    SPACE COMPLEXITY
    O(n)

    ------------------------------------------------------------

    THIS PATTERN IS USED IN MANY PROBLEMS

    - Longest subarray with sum K
    - Count subarrays with sum K
    - Largest subarray with sum 0
    - Equal number of 0s and 1s
*/

public class LongestSumSubArrayNegative {

    public static void main(String[] args) {

        int[] arr = { 9, -3, 3, -1, 6, -5 };
        int k = 0;

        // HashMap to store prefixSum → index
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0; // running prefix sum
        int maxLength = 0; // stores longest subarray length

        for (int i = 0; i < arr.length; i++) {

            // update running prefix sum
            sum += arr[i];

            /*
             * Case 1:
             * If prefix sum equals k,
             * subarray from index 0 to i has sum k
             */
            if (sum == k) {
                maxLength = i + 1;
            }

            /*
             * Case 2:
             * If (prefixSum - k) exists in map,
             * a subarray with sum k exists
             */
            if (map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);

                maxLength = Math.max(maxLength, length);
            }

            /*
             * Store prefix sum only first time
             * to maximize subarray length
             */
            map.putIfAbsent(sum, i);
        }

        // print result
        System.out.println(maxLength);
    }
}
