package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);

        point2D.setX(3);
        point2D.setY(4);
        System.out.println(point2D);

        point2D.getXY();
        System.out.println(point2D);
    }
}
