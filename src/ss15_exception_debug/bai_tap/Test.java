package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleCheck triangleCheck = new TriangleCheck();
        try {
            System.out.print("Nhap canh a : ");
            int a = sc.nextInt();
            System.out.print("Nhap canh b : ");
            int b = sc.nextInt();
            System.out.print("Nhap canh c : ");
            int c = sc.nextInt();

            try {
                triangleCheck.checkTriangle(a, b, c);
            } catch (TriangleException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.print("Khong dung 3 canh cua tam giac ");;
        }
    }
}