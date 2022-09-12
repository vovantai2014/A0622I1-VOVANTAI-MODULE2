package ss2_loop_in_java;

public class ShowPrimeNumberLess100 {
    public static void main(String[] args) {
        int x = 2;
        while (x < 100) {
            if (isPrimeNumber(x)) {
                System.out.println("So nguyen to nho hon 100 :" + x);
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
