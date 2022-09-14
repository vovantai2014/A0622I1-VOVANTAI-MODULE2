package ss3_array_and_method_in_java;

import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang 1 :");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        inputArray(array1, scanner);

        System.out.print("Nhap so phan tu mang 2 :");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        inputArray(array2, scanner);
        outputArray(array1);
        outputArray(array2);
//        int [] array3 = new int[n+m];
        System.out.print("Mang 1 + Mang 2 :");
        outputArray(sumArray(array1, array2));

    }

    public static void inputArray(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu " + i + " :");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sumArray(int[] arr1, int[] arr2) {
        int[] arrNew = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrNew[arr1.length + i] = arr2[i];
        }
        return arrNew;
    }
}

