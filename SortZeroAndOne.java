package Array;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 };
        for (int value : arr) {
            System.out.print(value + " ");
        }

        int zCount = 0;

        for (int value : arr) {
            if (value == 0) {
                zCount++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println();
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
