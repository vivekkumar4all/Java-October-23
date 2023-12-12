public class Day {

    static String getDay(int day) {
        switch (day) {
            case 1:
            case 8:
                return "MONDAY";
            case 2:
            case 9:
                return "TUESDAY";
            case 3:
            case 10:
                return "WEDNESDAY";
            case 4:
            case 11:
                return "THURSDAY";
            case 5:
            case 12:
                return "FRIDAY";
            case 6:
            case 13:
                return "SATURDAY";
            case 7:
            case 14:
                return "SUNDAY";
            default:
                return "INVALID DATE";
        }
    }

    static String getMonth(int month) {
        switch (month) {
            case 1:
                return "JANUARY";

            default:
                break;
        }
    }

    public static void main(String[] args) {

    }
}