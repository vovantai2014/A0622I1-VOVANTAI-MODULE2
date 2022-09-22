package ss7_abstract_and_interface.bai_tap.interface_colorable;

public class RectangleColorAble extends Shape {
    private double length;
    private double width;

    public RectangleColorAble() {
    }

    public RectangleColorAble(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "RectangleColorAble{" +
                "length=" + length +
                ", width=" + width +
                ", Rectangle Area =" + getArea() +
                '}';
    }
}
