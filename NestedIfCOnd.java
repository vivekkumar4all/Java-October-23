public class NestedIfCOnd {
    public static void main(String[] args) {
        boolean isTeacher = true;
        boolean isAdmin = true;
        boolean isWifiAval = false;

        if (isAdmin) {
            if (isTeacher) {
                if (isWifiAval) {
                    System.out.println("Wifi is Present");
                } else {
                    System.out.println("Wifi is absent");
                }
            } else {
                System.out.println("You are not a teacher");
            }
        } else {
            System.out.println("You are not an Admin");
        }
    }
}
