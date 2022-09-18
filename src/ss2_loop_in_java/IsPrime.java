package ss2_loop_in_java;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Input a number :");
        number = sc.nextInt();

        if (number < 2) {
            System.out.println("Number "+ number + " is NOT a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("Number "+ number + " is a Prime");
            } else {
                System.out.println("Number " + number + " is NOT a Prime");
            }
        }
    }
}
