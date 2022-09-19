package ss6_inheritance.thuc_hanh.geometric_inheritance;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Hinh tron ban dau : " +circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle("red", false, 4);
        System.out.println(circle3);
        System.out.println(circle3.getArea());
    }
}
