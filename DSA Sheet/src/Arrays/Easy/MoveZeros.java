package Arrays.Easy;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };

        int[] result = moveZerosToLeft(arr);
        // int[] result2 = moveZerosToRight(arr);

        System.out.print("Left - ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        /*
         * System.out.print("Right - ");
         * for (int num : result2) {
         * System.out.print(num + " ");
         * }
         */
    }

    static int[] moveZerosToLeft(int[] arr) {

        // output - 0 0 0 1 2 3 4 1
        int j = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    static int[] moveZerosToRight(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
