package ss7_abstract_and_interface.bai_tap.interface_colorable;

public class ColorAbleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleColorAble("White", true, 3.0);
        shapes[1] = new RectangleColorAble("White", true, 8.0, 6.0);
        shapes[2] = new SquareColorAble("White", true, 5.0);

        System.out.println("*** Hiển thị diện tích các hình trong mảng ***");
        for (Shape x : shapes) {
//            Shape.printShape(shapes);
            System.out.println(x);
        }
        for (Shape x : shapes) {
            if (x instanceof SquareColorAble) {
                System.out.println("*** Gọi phương thức howToColor() khi hình là 1 Colorable *** ");
                ((SquareColorAble) x).howToColor();
            }
        }
    }
}
