import java.util.Scanner;

public class Temp {
    static int powerValue = 1;
    static void printPower( int num ,int power){
        if(power==0){
            return ;
        }
        powerValue = powerValue * num;
        printPower(num, power-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();
        printPower(num, power);
        System.out.println("The result is " +  powerValue );
        sc.close();
    }
    
}