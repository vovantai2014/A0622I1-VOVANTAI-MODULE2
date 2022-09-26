package ss6_inheritance.bai_tap.cirle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {

        Circle cylinder = new Cylinder(10,"red",10);
        System.out.println("Dien Tich Hinh Tru :"+cylinder.getArea());
        System.out.println("The Tich Hinh Trụ : "+((Cylinder)cylinder).getVolume());
    }
}
