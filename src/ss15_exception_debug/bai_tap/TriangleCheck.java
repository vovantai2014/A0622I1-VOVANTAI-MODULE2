package ss15_exception_debug.bai_tap;

public class TriangleCheck {
    public void checkTriangle(int a, int b, int c) throws TriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleException("Nhap sai");
        } else if (a > (b + c) || b > (a + c) || c > (a + b)) {
            throw new TriangleException("Khong phai 3 canh cua tam giac ");
        } else {
            System.out.println("La 3 canh cua tam giac ");
        }
    }
}
