package ss15_exception_debug.thuc_hanh;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap index cua so bat ky : ");
        int x = sc.nextInt();
        try {
            System.out.print("Gia tri cua phan tu co chi so" + x + " la " + arr[x]);

        } catch (IndexOutOfBoundsException e) {
            System.err.print("Chi so vuot qua gioi han cua mang ");
        }
    }
}
