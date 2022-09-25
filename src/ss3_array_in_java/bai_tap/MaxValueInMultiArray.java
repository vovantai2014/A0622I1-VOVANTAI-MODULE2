package ss3_array_and_method_in_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MaxValueInMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 0;
        int cols = 0;
        System.out.print("Input rows of MultiArray: ");
        rows = scanner.nextInt();
        System.out.print("Input cols of MultiArray: ");
        cols = scanner.nextInt();

        int array[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Input element MultiArray[" + i + "]" + "[" + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
        double maxValue = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("Max value in MultiArray :" + maxValue);
    }
}
