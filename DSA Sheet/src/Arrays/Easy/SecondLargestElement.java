package Arrays.Easy;

/* 
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.


Examples
Example 1:
Input:
 [1, 2, 4, 7, 7, 5]  
Output:
  
Second Smallest : 2  
Second Largest : 5  

*/
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };

        findSecondSmallestAndLargest(arr);
    }

    static void findSecondSmallestAndLargest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("Not enough elements");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // -------------Second Smallest----------------
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        // -----------Second Largest-------------------
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("Second smallest number is: " + secondSmallest);
        System.out.println("Second largest number is: " + secondLargest);

    }
}
