package ss6_inheritance.bai_tap.cirle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();
//        System.out.println(cylinder);
//        cylinder = new Cylinder(2, "red",4);
//        System.out.println(cylinder);
//        System.out.println("Cylinder Volume : "+cylinder.getVolume());
//        cylinder.setHeight(5);
//        System.out.println("Cylinder Volume 2: "+cylinder.getVolume());

        Circle cylinder = new Cylinder(10,"red",10);
        System.out.println("Dien Tich Hinh Tru :"+cylinder.getArea());
        System.out.println("The Tich Hinh Trụ : "+((Cylinder)cylinder).getVolume());
    }
}
