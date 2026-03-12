package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

/* 

    Problem Statement: Given an array of integers arr[] and an integer target.

    1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

    2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

    Examples

    Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
    Output : YES
    Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].

    Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
    Output : NO.
    Explanation: There exist no such two numbers whose sum is equal to the target. 

*/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int k = 14;

        boolean bruteForceResult = twoSumBF(arr, k);
        System.out.println(bruteForceResult);

        int[] betterApproachResult = twoSumBA(arr, k);
        for (int num : betterApproachResult) {
            System.out.print("Index: " + num + " ");
        }

    }

    static boolean twoSumBF(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] twoSumBA(int[] arr, int k) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                result[0] = map.get(k - arr[i]);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
}
