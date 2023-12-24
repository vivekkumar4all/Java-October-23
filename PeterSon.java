public class PeterSon {

    static int findFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFact(num - 1);
    }

    // static void isPeterson(int num) {
    // int sum = 0;
    // int numCopy = num;
    // while (num != 0) {
    // int lastDigit = num % 10;
    // sum = sum + findFact(lastDigit);
    // num = num / 10;
    // }

    // if (sum == numCopy) {
    // System.out.println("The number is Peterson");
    // } else {
    // System.out.println("The number is not Peterson");
    // }

    // }

    static int isPeterson(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + findFact(lastDigit);
            num = num / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int num = 145;
        int res = isPeterson(num);

        if (res == num) {
            System.out.println("The number is Peterson");
        } else {
            System.out.println("The number is not Peterson");
        }
    }
}
