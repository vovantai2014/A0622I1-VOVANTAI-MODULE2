package ss6_inheritance.bai_tap.point2d_and_point3d;

public class Point3DTest extends Point2D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,5,6);
        System.out.println(point3D);
        point3D.setXYZ(7,8,9);
        System.out.println(point3D);

    }
}
