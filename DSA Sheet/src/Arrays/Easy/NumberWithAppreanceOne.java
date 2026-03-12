package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

/* 

    Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

    Examples
    Example 1:
    Input Format: arr[] = {2,2,1}
    Result: 1
    Explanation: In this array, only the element 1 appear once and so it is the answer.

*/
public class NumberWithAppreanceOne {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };

        // Optimized approach
        int uniqueNum = getUniqueNum(arr);
        System.out.println(uniqueNum);

        // Better approach
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : count.entrySet()) {
            if (map.getValue() == 1) {
                System.out.println(map.getKey());
            }
        }

    }

    static int getUniqueNum(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }
}
