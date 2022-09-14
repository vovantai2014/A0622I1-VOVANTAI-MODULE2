package ss3_array_and_method_in_java;

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap so phan tu cua mang :");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap lai so n (n>0)");
            }
        } while (n < 0);

        //Khoi tao mang va cap phat bo nho
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang !");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " :");
            array[i] = sc.nextInt();
        }

        // Hien thi mang
        System.out.println("Mang vua khoi tao :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.println("Nhap gia tri chen :");
        int k = sc.nextInt();
        System.out.println("Nhap vi tri chen :");
        int index = sc.nextInt();
        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Khong chen dc ");
        } else {
            int[] arrayNew = insertArray(array, k, index);
            System.out.println("Mang sau khi chen :");
            for (int i = 0; i < arrayNew.length; i++) {
                System.out.println(arrayNew[i] + "\t");
            }
        }
//        int [] arrayNew = insertArray(array,5,2);
//        System.out.println("Mang sau khi chen:");
//        for (int i = 0; i <arrayNew.length ; i++) {
//            System.out.println(arrayNew[i] + "\t");
//        }
    }

    public static int[] insertArray(int[] arr, int k, int index) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = arr[i];
            } else if (i == index) {
                result[i] = k;
            } else {
                result[i] = arr[i - 1];
            }

        }
        return result;
    }
}
