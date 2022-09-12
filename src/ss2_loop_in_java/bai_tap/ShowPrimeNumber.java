package ss2_loop_in_java;

public class ShowPrimeNumber {
    public static void main(String[] args) {
        int count = 1;
        int x = 2;
        while (count <= 20) {
            if (isPrimeNumber(x)) {
                System.out.println("So nguyen to thu " + count + "la :" + x);
                count++;
            }
            x++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}