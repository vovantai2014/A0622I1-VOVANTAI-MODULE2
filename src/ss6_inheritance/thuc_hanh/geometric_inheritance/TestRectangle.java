package ss6_inheritance.thuc_hanh.geometric_inheritance;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("yellow",true, 2.5, 3.5);
        System.out.println(rectangle);
    }
}
