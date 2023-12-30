public class IsPowerOfTwo {
    static boolean isPowerOfTwo(int n){
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        boolean res = isPowerOfTwo(14);
        if(res){
            System.out.println("the number exist in power of 2");
        }else{
            System.out.println("the number does not exist in power of two");
        }
    }
}
