package Arrays.Easy;

/* 
    Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

    Examples
    Example 1:
    Input:
    arr[] = 1 2 3 4 5, num = 3  
    Output: 2  `
    Explanation: 3 is present at the 2nd index of the array.
*/
public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("The value of k is present at the index: " + i);
                break;
            }
        }
    }
}
