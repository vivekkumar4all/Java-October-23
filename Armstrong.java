package Array;

public class Armstrong {

    // this is solved
    static int findLenght(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // this is solved
    static int findPower(int baseNumber, int exponent) {
        int powerValue = 1;
        for (int i = 1; i <= exponent; i++) {
            powerValue = powerValue * baseNumber;
        }
        return powerValue;
    }

    static int isArmstrong(int num) {
        int numLen = findLenght(num);
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + findPower(lastDigit, numLen);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 115, 45, 153, 897, 370, 371, 350, 407, 4545, 1634 };

        for (int i = 0; i < arr.length; i++) {
            int res = isArmstrong(arr[i]);

            if (res == arr[i]) {
                System.out.println(arr[i] + " is Armstrong");
            } else {
                System.out.println(arr[i] + " is Not Armstrong");
            }
        }
    }
}
