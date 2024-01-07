package Array;

public class SecondMax {

    static int findSecondMax(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Size invalid");
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest");
        } else {
            return secMax;
        }
        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = { -90, -60, 45, 12, 66, 45, 58 };
        int res = findSecondMax(arr);

        System.out.println(res);
    }
}
