public class FactAndPowerSeries {

    static int findPower(int baseNumber, int exponent) {
        int powerValue = 1;
        for (int i = 1; i <= exponent; i++) {
            powerValue = powerValue * baseNumber;
        }
        return powerValue;
    }

    static int findFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFact(num - 1);
    }

    static void series(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum = sum + (findPower(i, i) / findFact(i));
        }
    }

    public static void main(String[] args) {

    }
}
