package ss3_array_and_method_in_java;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap so phan tu cua mang :");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Hay nhap lai so n >0");
            }
        } while (n < 0);

        //Khoi tao mang va cap phat bo nho cho mang
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " :");
            array[i] = sc.nextInt();
        }

        // Hien thi mang vua nhap
        System.out.println("Mang vua khoi tao :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.print("Nhap vao gia tri can xoa : ");
        int k = sc.nextInt();
        int[] newArray = deleteElement(array, k);
        System.out.println("Mang sau khi xoa :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }


    public static int[] deleteElement(int[] arr, int k) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] == k) {
                for (int j = i; j < newArr.length; j++) {
                    newArr[j] = arr[j + 1];
                }
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}

