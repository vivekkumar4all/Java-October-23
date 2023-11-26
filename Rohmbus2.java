public class Rohmbus2 {
    public static void main(String[] args) {

        //this loop is used to control the rows
        for (int j = 0; j < 5; j++) {

            //this loop is used to print the spaces
            for (int k = 5; k > j; k--) {
                System.out.print(" ");
            }

            //this loop is used to print the stars
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
