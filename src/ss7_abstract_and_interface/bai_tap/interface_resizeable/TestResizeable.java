package ss7_abstract_and_interface.bai_tap.interface_resizeable;

public class TestResizeable {

    public static void main(String[] args) {
//        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", true, 4);
        shapes[1] = new Rectangle("Orange", true, 6, 4);
        shapes[2] = new Square("Pink", false, 3);

        for (Shape a : shapes) {
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.floor(Math.random() * 10));
        }
        System.out.println();
        Shape.printShape(shapes);
            
        }
    }

