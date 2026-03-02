package Arrays.Easy;

/*

    Problem Statement: Given an array, we have to find the largest element in the array.

    Examples
    Example 1:
    Input:
    arr[] = {2, 5, 1, 3, 0}  
    Output: 5 
 
*/
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };

        int largest = getLargestNumber(arr);
        System.out.println("Largest number is: " + largest);
    }

    static int getLargestNumber(int[] arr) {

        int max = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
