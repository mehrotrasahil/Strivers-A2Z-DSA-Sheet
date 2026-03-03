package Arrays.Easy;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int length = arr.length;

        int[] result = moveZerosToLeft(arr, length);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] moveZerosToLeft(int[] arr, int length) {

        for (int i = length - 1; i > 0; i--) {
            if (arr[i] == 0) {
                int temp = arr[length - 1];
                arr[length - 1] = arr[i];
                arr[i] = temp;
                length--;
            }
        }
        return arr;
    }
}
