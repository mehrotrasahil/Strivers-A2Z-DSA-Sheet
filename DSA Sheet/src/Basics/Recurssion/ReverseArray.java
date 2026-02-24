package Basics.Recurssion;

/* 

Problem Statement: You are given an array. The task is to reverse the array and print it.

Examples
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}

Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
the second element occupies the fourth position and so on.

Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}

Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
the second element occupies the fourth position and so on.


*/
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        reverse(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}
