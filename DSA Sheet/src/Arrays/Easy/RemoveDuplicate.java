package Arrays.Easy;

/* 

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that 
each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. 
It does not matter what you leave beyond the first k elements.

Examples
Input: arr[]=[1,1,2,2,2,3,3]
Output: [1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] 
in the beginning of the array.

*/

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        int uniqueElements = removeDuplicates(arr);

        System.out.println("Number of unique elements are: " + uniqueElements);

        for (int i = 0; i < uniqueElements; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * Removes duplicates in-place from sorted array.
     * Returns the number of unique elements (k).
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * NOTE - If array is not sorted use HashSet
     */
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
