package ss14_sort_algorithm.bai_tap;

import java.util.Scanner;

public class InsertionSortInstall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang :");
        int n = sc.nextInt();

        int [] list = new int[n];
        System.out.print("Nhap " + list.length + " gia tri cua mang :");
        for (int i = 0; i <list.length ; i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.print("Mang sau khu sap xep :");
        insertionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void insertionSort(int [] array){
        for(int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
