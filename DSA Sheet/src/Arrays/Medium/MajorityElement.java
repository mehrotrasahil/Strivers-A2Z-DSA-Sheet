package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

/* 

Problem Statement: Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

Examples
Example 1:
Input:  nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
Output: 7  
Explanation:
 The number 7 appears 5 times in the 9-sized array, making it the most frequent element.
 
*/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };

        int result = countFrequency(arr);
        int optimalResult = countElement(arr);
        System.out.println(result);
        System.out.println(optimalResult);
    }

    // Better approach
    static int countFrequency(int[] arr) {
        int max = 0;
        int n = arr.length;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : count.entrySet()) {
            if (map.getValue() > n / 2) {
                max = map.getKey();
            }
        }

        return max;
    }

    // Optimal Approach
    static int countElement(int[] arr) {
        int count = 0;
        int element = 0;

        for (int num : arr) {
            if (count == 0) {
                element = num;
                count++;
            } else if (count != 0 && element == num) {
                count--;
            }
        }
        return element;
    }
}
