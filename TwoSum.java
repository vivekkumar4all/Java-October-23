package Array;

public class TwoSum {

    static int[] twoSum(int arr[], int target) {
        int newArr[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 0, 7, 2, 11, 15 };
        int res[] = twoSum(arr, 9);

        // System.out.println(res);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
