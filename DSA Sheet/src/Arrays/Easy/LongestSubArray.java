package Arrays.Easy;

/*
    PROBLEM: Longest Subarray with Sum = K (Array contains ONLY positive numbers)

    Given:
    An integer array and a target value K.

    Task:
    Find the length of the longest contiguous subarray whose sum equals K.

    Example:
    nums = [10, 5, 2, 7, 1, 9]
    k = 15

    Longest subarray with sum 15:
    [5, 2, 7, 1]

    Length = 4

    ------------------------------------------------------------

    APPROACH USED: Sliding Window (Two Pointers)

    WHY SLIDING WINDOW WORKS HERE:
    Because the array contains ONLY POSITIVE numbers.

    Properties:
    - Adding elements increases the sum
    - Removing elements decreases the sum

    Therefore:
    If sum becomes greater than K, we can safely shrink the window
    from the left side.

    ------------------------------------------------------------

    WINDOW REPRESENTATION

        left               right
          |                   |
          v                   v

        [ elements inside the window ]

    The window expands by moving 'right'
    The window shrinks by moving 'left'

    ------------------------------------------------------------

    ALGORITHM

    1. Start with:
       left = 0
       sum = 0
       maxLength = 0

    2. Expand the window by moving 'right'

    3. Add nums[right] to the running sum

    4. If sum becomes greater than k:
       shrink the window from the left until sum <= k

    5. If sum == k:
       update maxLength

    ------------------------------------------------------------

    IMPORTANT FORMULA

    Length of current subarray = right - left + 1

    Why +1?

    Because both left and right indices are included.

    Example:
    left = 1
    right = 4

    Subarray = [5,2,7,1]

    length = 4 - 1 + 1 = 4

    ------------------------------------------------------------

    TIME COMPLEXITY
    O(n)

    Each element is visited at most twice
    (once by right pointer and once by left pointer)

    SPACE COMPLEXITY
    O(1)

    ------------------------------------------------------------

    IMPORTANT NOTE (INTERVIEW)

    This sliding window approach ONLY works when:
    the array contains positive numbers.

    If the array contains negative numbers,
    we must use Prefix Sum + HashMap instead.

*/

public class LongestSubArray {

    public static void main(String[] args) {

        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        // maxLength → stores the longest valid subarray length
        // left → start of sliding window
        // sum → current sum of elements inside the window
        int maxLength = 0, left = 0, sum = 0;

        // right pointer expands the window
        for (int right = 0; right < nums.length; right++) {

            // include current element in the window
            sum += nums[right];

            /*
             * If the sum becomes larger than k,
             * shrink the window from the left side
             * until sum becomes <= k
             */
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            /*
             * If current window sum equals k,
             * update the maximum length.
             */
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        // print the longest subarray length
        System.out.println(maxLength);
    }
}
