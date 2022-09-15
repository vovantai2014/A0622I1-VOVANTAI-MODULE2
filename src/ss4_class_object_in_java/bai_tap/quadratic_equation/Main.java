package ss4_class_object_in_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a : ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so b :");
        double b = sc.nextDouble();

        System.out.print("Nhap he so c :");
        double c = sc.nextDouble();

        // Khoi tao doi tuong PTB2:
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        if (ptb2.getDiscriminant() < 0) {
            System.out.print("Phuong trinh vo nghiem ");
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep " + "x1, x2 = " + (-(b / 2 * a)));
        } else {
            System.out.print("Phuong trinh co 2 nghiem phan biet :");
            System.out.print("x1 = " + ptb2.getRoot1() + "\t");
            System.out.print("x2 = " + ptb2.getRoot2());
        }

    }
}
