package ss6_inheritance.bai_tap.cirle_and_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(4,"green");
        System.out.println(circle);

        Circle circle2 = new Circle(5, "red");
        System.out.println(circle2);
        System.out.println("Dien tich = "+circle2.getArea());
        System.out.println("Chu vi = "+circle2.getPerimeter());
    }
}
