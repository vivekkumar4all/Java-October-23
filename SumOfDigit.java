public class SumOfDigit {
    public static void main(String[] args) {
        int num = 42563;
        int sum = 0;
        while (num != 0) {
            int remainderValue = num % 10;
            sum = sum + remainderValue;
            num = num / 10;
        }
        System.out.println("This is the Sum of the Digits :" + sum);
    }
}
