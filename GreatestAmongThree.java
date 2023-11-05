public class GreatestAmongThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c = 6;
        String res = (a > b && a > c) ? "a is greater" : "";
        String res2 = (b > a && b > c) ? "b is greater" : "";
        String res3 = (c > a && c > b) ? "c is greater" : "";

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
