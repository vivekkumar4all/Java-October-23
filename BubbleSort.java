package Array;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 7, 1, 2, 4 };
        int len = arr.length;
        System.out.println("This is before sort");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("This is after sort");

        // traditional for loop syntax
        // for (int i = 0; i < len; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // enhanced for loop syntax
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
