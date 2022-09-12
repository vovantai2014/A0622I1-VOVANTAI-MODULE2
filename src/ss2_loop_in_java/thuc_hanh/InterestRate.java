package ss2_loop_in_java;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        double interestRate;
        double money;

        System.out.println("Nhap so tien gui :");
        money = sc.nextDouble();
        System.out.println("Nhap so thang gui :");
        month = sc.nextInt();
        System.out.println("Nhap lai suat :");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest :" + totalInterest);
    }
}
