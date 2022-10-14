package ss14_sort_algorithm.thuc_hanh;

import java.util.Scanner;

public class BubbleSortIllustration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang so nguyen : ");
        int n = sc.nextInt();

        int[] list = new int[n];
        System.out.print("Nhap " + list.length + " gia tri :");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();

        }
        System.out.println("Mang vua nhap");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nMang sau khi sap xep ");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
