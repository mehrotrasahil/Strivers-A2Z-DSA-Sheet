package Arrays.Easy;

/* 

    Problem Statement: Given an integer array nums, rotate the array to the left by one.

    Note: There is no need to return anything, just modify the given array.

    Examples
    Example 1:
    Input:
    nums = [1, 2, 3, 4, 5]  
    Output:
    [2, 3, 4, 5, 1]  
    Explanation:
    Initially, nums = [1, 2, 3, 4, 5]  
    Rotating once to the left results in nums = [2, 3, 4, 5, 1].

*/
public class RotateElementByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        rotateArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotateArray(int[] arr) {

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

}
