package Introduction_to_java;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollar, vnd;
        final double rate = 23000;

        System.out.println("Input Dollar :");
        dollar = sc.nextDouble();

        vnd = rate * dollar;

        System.out.println("Converted : " + vnd + " vnd");
    }
}
