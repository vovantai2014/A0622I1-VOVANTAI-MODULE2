package ss2_loop_in_java;

import java.util.Scanner;

public class ShapeShow {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Menu---");
        System.out.println("1. Print the Rectangle :");
        System.out.println("2. Print the Square Triangle :");
        System.out.println("3. Print isosceles triangle :");
        System.out.println("Enter your choice number (1 to 4): ");
        System.out.println("---Exit---");
        choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            System.out.println();

        } else if (choice == 3) {
            int x = 0;
            for (int i = 1; i <= 6; ++i, x = 0) {
                for (int j = 1; j <= 6 - i; ++j) {
                    System.out.print("  ");
                }
                while (x != 2 * i - 1) {
                    System.out.print("* ");
                    ++x;
                }
                System.out.println();
            }
        } else if (choice == 4) {
            System.out.println("Exit");
        } else {
            System.out.println("Please choice 1 to 4 !!!!");
        }
        System.out.println("Enter your choice number (1 to 4): ");
    }
}

