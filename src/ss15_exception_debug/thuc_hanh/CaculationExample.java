package ss15_exception_debug.thuc_hanh;

import java.util.Scanner;

public class CaculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x : ");
        int x = sc.nextInt();
        System.out.print("Nhap y : ");
        int y = sc.nextInt();
        CaculationExample caculationExample = new CaculationExample();
        caculationExample.caculate(x,y);

    }

    private void caculate(int x, int y) {
        try {
            float a = x + y;
            float b = x - y;
            float c = x * y;
            double d = (x / y);
            System.out.println("Tong x + y : " + a);
            System.out.println("Hieu x - y : " + b);
            System.out.println("Tich x * y : " + c);
            System.out.println("Thuong x / y : " + d);
        }catch (Exception e){
            System.err.print("Khong the chia so 0, nhap y # 0");
        }
    }
}
