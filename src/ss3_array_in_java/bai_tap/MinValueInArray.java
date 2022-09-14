package ss3_array_and_method_in_java;

import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.printf("Nhap so phan tu cua mang :");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lai so nguyen duong n >0");
            }
        } while (n < 0);

        // Khoi tao mang va cap phat bo nho
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu " + "array[" +i + "]:");
            array[i] = sc.nextInt();
        }

        //Hien thi mang vua tao
        System.out.println("Mang vua khoi tao :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        // Tim GTNN trong mang
        int min = array[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
                index += i;
            }
        }
        System.out.println("Gia tri NN trong mang MinValue : " + min);
        System.out.println("Vi tri NN MinIndex : " + index);
    }
}
